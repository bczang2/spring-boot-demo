package com.cycfc.group.demo.entity.base;

public class DataResponse<T> {

    /**
     * 返回码【默认200成功状态】
     */
    public Integer code = 200;

    /**
     * 返回描述信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public DataResponse(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
