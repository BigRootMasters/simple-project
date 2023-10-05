package com.li.simpleproject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(UserInfo)实体类
 *
 * @author makejava
 * @since 2023-10-05 03:11:02
 */
@Setter
@Getter
@ToString(callSuper = true)
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -32319597938904119L;
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

