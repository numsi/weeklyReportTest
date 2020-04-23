package com.test.weekly_report.entity;

import java.util.HashMap;

public class Layui  extends HashMap<String, Object> {

    public static Layui data(Integer count, Object data){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
    public static Layui ok(){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", "");
        r.put("data", "");
        return r;
    }

    public static Layui all(Integer code, String msg, Integer count, Object data){
        Layui r = new Layui();
        r.put("code", code);
        r.put("msg", msg);
        r.put("count", count);
        r.put("data", data);
        return r;
    }
    public static Layui error(String msg){
        Layui r = new Layui();
        r.put("code", -1);
        r.put("msg", msg);
        r.put("count", "");
        r.put("data", "");
        return r;
    }



}

