package com.ztl.controller;

import lombok.Data;

@Data
public class Result {
    //结果数据
    private Object data;

    //状态码
    private Integer code;

    //返回消息，可选
    private String msg;

    public Result(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
