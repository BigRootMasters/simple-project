package com.li.simpleproject.controller;

import com.li.simpleproject.entity.GoodsInfo;
import com.li.simpleproject.service.GoodsInfoService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import java.util.Date;

class GoodsInfoControllerTest {

    @Resource
    GoodsInfoService goodsInfoService;

    @Test
    void selectAll() {
    }

    @Test
    void selectOne() {
    }

    @Test
    void insert() {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGoodName("1");
        goodsInfo.setGoodTitle("1");
        goodsInfo.setGoodType("1");
        goodsInfo.setGoodNumber(0L);
        goodsInfo.setGoodDetail("1");
        goodsInfo.setGoodDescribe("1");
        goodsInfo.setGoodImage("1");
        goodsInfo.setGoodLink("1");
        goodsInfo.setCreatedTime(new Date());
        goodsInfo.setUpdatedTime(new Date());
        goodsInfo.setDeleteStatus("");
        goodsInfoService.save(goodsInfo);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}