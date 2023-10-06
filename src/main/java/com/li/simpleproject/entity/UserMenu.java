package com.li.simpleproject.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户菜单表
 * @author kuan
 * @TableName user_menu
 */
@Data
public class UserMenu implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 菜单
     */
    private String menu;

}