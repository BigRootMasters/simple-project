package com.li.simpleproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.simpleproject.dao.OrderInfoDao;
import com.li.simpleproject.entity.OrderInfo;
import com.li.simpleproject.service.OrderInfoService;
import org.springframework.stereotype.Service;

/**
 * 订单信息表(OrderInfo)表服务实现类
 *
 * @author lk
 * @since 2023-10-06 05:19:01
 */
@Service("orderInfoService")
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoDao, OrderInfo> implements OrderInfoService {

}

