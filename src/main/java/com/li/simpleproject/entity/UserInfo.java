package com.li.simpleproject.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(UserInfo)实体类
 *
 * @author makejava
 * @since 2023-10-05 14:08:42
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 214147925333302928L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户头像
     */
    private String userImage;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 注册时间
     */
    private Date registedTime;
    /**
     * 删除状态(0未删除,1已删除)
     */
    private String deleteStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getRegistedTime() {
        return registedTime;
    }

    public void setRegistedTime(Date registedTime) {
        this.registedTime = registedTime;
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

}

