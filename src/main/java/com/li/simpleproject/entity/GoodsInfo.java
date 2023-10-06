package com.li.simpleproject.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品信息表(GoodsInfo)表实体类
 *
 * @author lk
 * @since 2023-10-06 04:56:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuppressWarnings("serial")
public class GoodsInfo extends Model<GoodsInfo> {
    //id
    private Long id;
    //商品名称
    private String goodName;
    //商品标题
    private String goodTitle;
    //商品类型
    private String goodType;
    //商品数量
    private Long goodNumber;
    //商品详情
    private String goodDetail;
    //商品描述
    private String goodDescribe;
    //商品图片
    private String goodImage;
    //商品链接
    private String goodLink;
    //创建时间
    private Date createdTime;
    //修改时间
    private Date updatedTime;
    //删除状态
    private String deleteStatus;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}

