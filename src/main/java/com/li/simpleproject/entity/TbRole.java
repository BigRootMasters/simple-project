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
 * 角色表
 * </p>
 *
 * @author lk
 * @since 2023-10-06
 */
@Data
@TableName("tb_role")
public class TbRole implements Serializable {
@Serial
    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    @TableField("role_name")
    private Long roleName;


    @TableField("created_time")
    private LocalDateTime createdTime;


    @TableField("created_by")
    private String createdBy;


    @TableField("updated_time")
    private LocalDateTime updatedTime;


    @TableField("updated_by")
    private String updatedBy;


    @TableField("delete_status")
    private String deleteStatus;


}




