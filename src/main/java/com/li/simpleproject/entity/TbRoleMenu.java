package com.li.simpleproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 角色菜单表
 * </p>
 *
 * @author lk
 * @since 2023-10-06
 */
@Data
@TableName("tb_role_menu")
public class TbRoleMenu implements Serializable {
@Serial
private static final long serialVersionUID = 1L;

/**
 * 主键id
 */
@TableId(value = "id", type = IdType.AUTO)
private Long id;

/**
 * 角色id
 */
@TableField("role_id")
private Long roleId;

/**
 * 菜单id
 */
@TableField("menu_id")
private Long menuId;

/**
 * 创建时间
 */
@TableField("created_time")
private LocalDateTime createdTime;

/**
 * 创建人
 */
@TableField("created_by")
private String createdBy;

/**
 * 更新时间
 */
@TableField("updated_time")
private LocalDateTime updatedTime;

/**
 * 更新人
 */
@TableField("updated_by")
private String updatedBy;

/**
 * 删除状态
 */
@TableField("delete_status")
private String deleteStatus;


        }




