package com.superstar.model.common;

import com.github.pagehelper.Page;
import com.superstar.enums.RtCode;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: BillYu
 * @Description:api返回信息
 * @Date: Created in 下午2:29 2018/4/28.
 */
public class RtData implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public RtData() {
        super();
        this.setCode(RtCode.SUCCESS.getCode());
        this.setMsg(RtCode.SUCCESS.getMsg());
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public RtData setData(Object obj) {
        data = obj;
        return this;
    }

    public RtData setData(String key, Object value) {
        if (data != null && data instanceof Map) {
            ((Map) data).put(key, value);
        } else {
            data = new HashMap<String, Object>();
            ((Map) data).put(key, value);
        }
        return this;
    }

    public RtData setResults(Object list) {
        return setData("results", list);
    }

    public RtData setTotal(long value) {
        return setData("total", value);
    }

    public RtData setCount(int value) {
        return setData("count", value);
    }

    public RtData setList(List list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            setResults(page.getResult());
            setTotal(page.getTotal());
            setCount(list.size());
        } else {
            setResults(list);
        }
        return this;
    }
}


