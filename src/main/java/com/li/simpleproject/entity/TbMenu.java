package com.li.simpleproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author lk
 * @since 2023-10-06
 */
@Data
@TableName("tb_menu")

public class TbMenu implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    @TableField("menu_name")
    private Long menuName;


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




