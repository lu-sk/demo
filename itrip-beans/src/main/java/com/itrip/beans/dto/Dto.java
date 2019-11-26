package com.itrip.beans.dto;

/**
 * 数据传输对象
 */
public class Dto<T> {
    /**
     * 展示成功（true:成功，false:失败）
     */
    private String success;
    /**
     * 错误码（）
     */
    private String errorCode;
    private String msg;
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
