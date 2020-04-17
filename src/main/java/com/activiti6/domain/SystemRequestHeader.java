package com.activiti6.domain;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description:
 * @Author: zhouj
 * @Date: 2019/9/5 16:17
 */
public class SystemRequestHeader implements Serializable{
    /**
     * 服务编号
     */
    private String serviceCode;

    /**
     * 客户端
     */
    @NotNull(message = "客户端类型不能为空")
    private Integer client;

    /**
     * 调用人
     */
    @NotNull(message = "客户端类型不能为空")
    @Range(min = 1, max = 2, message = "客户端类型范围在{min}和{max}之间")
    private Integer source;

    /**
     * 调用方法uri
     */
    private String method;

    /**
     * 接口调用人
     */
    private String userId;

    /**
     * 接口调用人用户名
     */
    private String username;

    /**
     * token
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
