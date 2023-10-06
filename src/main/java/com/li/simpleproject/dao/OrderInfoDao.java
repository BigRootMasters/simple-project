package com.li.simpleproject.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.simpleproject.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单信息表(OrderInfo)表数据库访问层
 *
 * @author lk
 * @since 2023-10-06 05:19:01
 */
public interface OrderInfoDao extends BaseMapper<OrderInfo> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderInfo> entities);

}

