package com.example.constellation.luckfrag;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.constellation.R;
import com.example.constellation.bean.StarBean;

import java.util.List;


public class LuckFragment extends Fragment {

    GridView luckGv;
    List<StarBean.StarinfoBean> mDatas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_luck, container, false);
        luckGv = view.findViewById(R.id.luckfrag_gv);
//        获取数据源
        Bundle bundle = getArguments();
        StarBean infobean = (StarBean) bundle.getSerializable("info");
        mDatas = infobean.getStarinfo();
//        设置适配器
        LuckBaseAdapter adapter = new LuckBaseAdapter(getContext(), mDatas);
        luckGv.setAdapter(adapter);

//        设置GridView每一项的监听事件
        setListener();
        return view;
    }

    private void setListener() {
        luckGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                StarBean.StarinfoBean bean = mDatas.get(position);
                String name = bean.getName();
                Intent intent = new Intent(getContext(), LuckAnalysisActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}