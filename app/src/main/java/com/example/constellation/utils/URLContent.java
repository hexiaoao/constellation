package com.example.constellation.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLContent {
//    星座配对接口
    public static String getPartnerURL(String man,String woman){
        man = man.replace("座", "");
        woman = woman.replace("座","");
        try {
            man = URLEncoder.encode(man,"UTF-8");
            woman = URLEncoder.encode(woman,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = "http://apis.juhe.cn/xzpd/query?men="+man+"&women="+woman+"&key=9d3700cdced1d58e553fcb74c2b247d5";
        return url;
    }
//    星座运势接口
    public static String getLuckURL(String name){
        try {
            name = URLEncoder.encode(name,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String url = "http://web.juhe.cn:8080/constellation/getAll?consName="+name+"&type=year&key=7fe1ead20179ccf4e6bcb6b491172aa1";
        return url;
    }
}
