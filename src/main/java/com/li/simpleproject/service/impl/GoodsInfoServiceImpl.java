package com.li.simpleproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.simpleproject.dao.GoodsInfoDao;
import com.li.simpleproject.entity.GoodsInfo;
import com.li.simpleproject.service.GoodsInfoService;
import org.springframework.stereotype.Service;

/**
 * 商品信息表(GoodsInfo)表服务实现类
 *
 * @author lk
 * @since 2023-10-06 04:56:26
 */
@Service("goodsInfoService")
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoDao, GoodsInfo> implements GoodsInfoService {

}

