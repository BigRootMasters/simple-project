package com.li.simpleproject.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Date;
import java.io.Serializable;

/**
 * 订单信息表(OrderInfo)表实体类
 *
 * @author lk
 * @since 2023-10-06 05:19:01
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInfo extends Model<OrderInfo> {
    @Serial
    private static final long serialVersionUID = -111719780394087093L;
    //主键id
    private Integer id;
    //订单id
    private String orderId;
    //订单号
    private Integer orderNo;
    //订单类型
    private String orderType;
    //订单状态
    private String orderStatus;
    //用户名
    private String userName;
    //用户手机号
    private String phoneNumber;
    //商品id
    private String goodsId;
    //商品类型
    private String goodType;
    //订单金额
    private Long orderMoney;
    //订单数量
    private Integer orderNum;
    //创建时间
    private Date createdTime;
    //更新时间
    private Date updateTime;
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

