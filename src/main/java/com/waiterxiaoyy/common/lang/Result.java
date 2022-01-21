package com.waiterxiaoyy.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述：封装结果数据
 *
 * @Author WaiterXiaoYY
 * @Date 2022/1/13 21:20
 * @Version 1.0
 */
@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
