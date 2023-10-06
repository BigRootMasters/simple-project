package com.li.simpleproject.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.simpleproject.entity.GoodsInfo;
import com.li.simpleproject.service.GoodsInfoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 商品信息表(GoodsInfo)表控制层
 *
 * @author lk
 * @since 2023-10-06 04:56:26
 */
@RestController
@RequestMapping("goodsInfo")
@Slf4j
public class GoodsInfoController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsInfoService goodsInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param goodsInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public Page<GoodsInfo> selectAll(Page<GoodsInfo> page, GoodsInfo goodsInfo) {
        return goodsInfoService.page(page, new QueryWrapper<>(goodsInfo));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public GoodsInfo selectOne(@PathVariable Serializable id) {
        log.info("goods info id");
        return this.goodsInfoService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param goodsInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public boolean insert(@RequestBody GoodsInfo goodsInfo) {
        return this.goodsInfoService.save(goodsInfo);
    }

    /**
     * 修改数据
     *
     * @param goodsInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public boolean update(@RequestBody GoodsInfo goodsInfo) {
        return this.goodsInfoService.updateById(goodsInfo);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public boolean delete(@RequestParam("idList") List<Long> idList) {
        return this.goodsInfoService.removeByIds(idList);
    }
}

