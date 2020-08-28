package com.wuhe.wuheadmin.entity;

import org.apache.ibatis.annotations.Result;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description :
 * @Date 2020/8/27 16:36
 * @Version 1.0
 **/
public class User implements Serializable {

    private String userName;
    private Integer userId;

    private String desc;

    public User(String userName, Integer userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public User(String userName, Integer userId, String desc) {
        this.userName = userName;
        this.userId = userId;
        this.desc = desc;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
