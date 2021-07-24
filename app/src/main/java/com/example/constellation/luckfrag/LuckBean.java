package com.example.constellation.luckfrag;

import java.util.List;

public class LuckBean {

    /**
     * name : 双鱼座
     * date : 2021年
     * year : 2021
     * mima : {"info":"需要多留些心","text":["今年，海王星仍然在双鱼座18度的位置左右徘徊。大部分双鱼座都是比较善良的人，为人处事也比较敏感。今年，由于木星的缘故，你们会比往年更加顺利、快乐一点，也没有那么容易悲观难过。但是，大家仍然需要在待人接物时多留几个心眼，遇到不开心的事情也一定要积极和家人、朋友倾诉，不要总是一个人扛着。总的来说，今年对你们而言是比较顺利的一年，鼓起勇气勇往直前。双鱼座今年可佩戴一个星盘保岁吉宏项链作为全年的幸运护身符饰物，银币铸造的船舵星符可提升双鱼们的能量指数，寓意今年信心十足、目标明确、勇往直前！"]}
     * career : ["出于海王星的影响，已经步入职场的双鱼们如果想要自己创业，或是开拓新的事业发展领域，那么今年无疑是比较不错的机会。还在读书的小伙伴们则能够在解决问题时另辟蹊径，得到老师与同学的赞赏。"]
     * love : ["今年你们的感情运势还算可以，单身的双鱼们身边常常围绕着桃花，但你们却有可能会因为工作繁忙、学业压力大等原因注意不到。已经有伴的小伙伴们则可以享受一段甜蜜的时光，不会发生什么较大的争吵，小日子也过得有滋有味。"]
     * health : ["本年健康运不错，大病不会发生，小病却也无法避免。只要能够多加注意自己的身体状况，有病及时去医院就医，那么就可以很快恢复健康，无需过于担心。"]
     * finance : ["今年你们的正财运良好，所涉足的各个领域都有比较稳定的收入，而且在投资理财时也很容易得到比较不错的收获。但是，你们却比较缺乏明确的消费观念，因此很容易一不小心就超支，给自己造成经济压力。不妨试着养成记账的习惯，这可以让你的财运有明显的回升。双鱼座今年可佩戴一串灵鳌增庆手链来提升金钱指数，鳌鱼有鲤化为龙与独占鳌头的象征，寓意双鱼们今年步步高升、奋发有为，期望今年财运亨通，学业事业皆顺遂。"]
     * luckeyStone : 青金石
     * future :
     * resultcode : 200
     * error_code : 0
     */

    private String name;
    private String date;
    private int year;
    private MimaBean mima;
    private String luckeyStone;
    private String future;
    private String resultcode;
    private int error_code;
    private List<String> career;
    private List<String> love;
    private List<String> health;
    private List<String> finance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MimaBean getMima() {
        return mima;
    }

    public void setMima(MimaBean mima) {
        this.mima = mima;
    }

    public String getLuckeyStone() {
        return luckeyStone;
    }

    public void setLuckeyStone(String luckeyStone) {
        this.luckeyStone = luckeyStone;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<String> getCareer() {
        return career;
    }

    public void setCareer(List<String> career) {
        this.career = career;
    }

    public List<String> getLove() {
        return love;
    }

    public void setLove(List<String> love) {
        this.love = love;
    }

    public List<String> getHealth() {
        return health;
    }

    public void setHealth(List<String> health) {
        this.health = health;
    }

    public List<String> getFinance() {
        return finance;
    }

    public void setFinance(List<String> finance) {
        this.finance = finance;
    }

    public static class MimaBean {
        /**
         * info : 需要多留些心
         * text : ["今年，海王星仍然在双鱼座18度的位置左右徘徊。大部分双鱼座都是比较善良的人，为人处事也比较敏感。今年，由于木星的缘故，你们会比往年更加顺利、快乐一点，也没有那么容易悲观难过。但是，大家仍然需要在待人接物时多留几个心眼，遇到不开心的事情也一定要积极和家人、朋友倾诉，不要总是一个人扛着。总的来说，今年对你们而言是比较顺利的一年，鼓起勇气勇往直前。双鱼座今年可佩戴一个星盘保岁吉宏项链作为全年的幸运护身符饰物，银币铸造的船舵星符可提升双鱼们的能量指数，寓意今年信心十足、目标明确、勇往直前！"]
         */

        private String info;
        private List<String> text;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public List<String> getText() {
            return text;
        }

        public void setText(List<String> text) {
            this.text = text;
        }
    }
}
