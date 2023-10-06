package com.li.simpleproject.common.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author kuan
 * @version 1.0
 * @description: 日期工具类
 * @date 2023/10/6 18:02
 */
@Slf4j
public class DateUtil {
//    public static String YYYY = "yyyy";
//
//    public static String YYYY_MM = "yyyy-MM";
//
//    public static String YYYY_MM_DD = "yyyy-MM-dd";
//
//    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前Date型日期
     *
     * @return Date() 当前日期
     */
    public static Date getNowDate() {
        return new Date();
    }

    public static void main(String[] args) {
        log.info("now {}", getNowDate());
    }

}

