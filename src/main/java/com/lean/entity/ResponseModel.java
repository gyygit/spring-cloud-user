package com.lean.entity;

import java.io.Serializable;

/**
 * 依赖工具类
 * 
 * @author YHAA-1ECEE4
 *
 */

public class ResponseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int status;
    private String msg;
    private Object data;
    private Object perm;

    public ResponseModel() {}

    public ResponseModel(int status, String msg, Object data)
    {
      this.status = status;
      this.msg = msg;
      this.data = data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getPerm() {
        return this.perm;
    }

    public void setPerm(Object perm) {
        this.perm = perm;
    }
}