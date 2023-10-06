package com.li.simpleproject.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.simpleproject.entity.OrderInfo;
import com.li.simpleproject.service.OrderInfoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 订单信息表(OrderInfo)表控制层
 *
 * @author lk
 * @since 2023-10-06 05:19:01
 */
@RestController
@RequestMapping("orderInfo")
public class OrderInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param orderInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public Page<OrderInfo> selectAll(Page<OrderInfo> page, OrderInfo orderInfo) {
        return this.orderInfoService.page(page, new QueryWrapper<>(orderInfo));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public OrderInfo selectOne(@PathVariable Serializable id) {
        return this.orderInfoService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param orderInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public boolean insert(@RequestBody OrderInfo orderInfo) {
        return this.orderInfoService.save(orderInfo);
    }

    /**
     * 修改数据
     *
     * @param orderInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public boolean update(@RequestBody OrderInfo orderInfo) {
        return this.orderInfoService.updateById(orderInfo);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public boolean delete(@RequestParam("idList") List<Long> idList) {
        return this.orderInfoService.removeByIds(idList);
    }
}

