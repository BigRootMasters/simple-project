package com.li.simpleproject.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表(UserInfo)实体类
 *
 * @author makejava
 * @since 2023-10-05 14:08:42
 */
@Data
public class UserInfo implements Serializable {
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

}

