package com.activiti6.domain;


import java.io.Serializable;

/**
 * @Description:
 * @Author: zhouj
 * @Date: 2019/9/5 16:17
 */
public class SystemRequestBody<T> implements Serializable {

    /**
     * 请求body
     */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
