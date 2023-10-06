package com.li.simpleproject.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.util.Date;
import java.io.Serializable;

/**
 * 用户信息表(UserInfo)实体类
 *
 * @author lk
 * @since 2023-10-06 04:29:43
 */
@Data
@Setter
@Getter
@ToString(callSuper = true)
public class UserInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -74688764345098668L;
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
    private Date registerTime;
    /**
     * 删除状态(0未删除,1已删除)
     */
    private String deleteStatus;

}

