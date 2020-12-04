package com.example.schoolkownclient.Activity.Apply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Third {

    private String code = "200";
    private String msg = "服务器返回成功";
    private RepData repData;
    public static class RepData {
        private Map<String, List<String>> third;

        public Map<String, List<String>> getThird() {

            Map<String, List<String>> map = new HashMap<>();

            List<String> list = new ArrayList<>();
            list.add("感冒");
            list.add("发烧");
            list.add("摔伤");
            list.add("水痘");

            List<String> list2 = new ArrayList<>();
            list2.add("比赛");
            list2.add("宴席");

            List<String> list3 = new ArrayList<>();
            list3.add("一日一次");
            list3.add("一日两次");
            list3.add("一日三次");

            List<String> list4 = new ArrayList<>();
            list4.add("一晚");
            list4.add("其他");


            map.put("病假", list);
            map.put("事假", list2);
            map.put("喂药", list3);
            map.put("留宿", list4);
            return map;
        }
        public void setThird(Map<String,List<String>> third) {
            this.third = third;
        }
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RepData getRepData() {
        return repData = new RepData();
    }

    public void setRepData(RepData repData) {
        this.repData = repData;
    }
}
