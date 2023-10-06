package com.li.simpleproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author kuan
 * @version 1.0
 * @description: 测试实体类
 * @date 2023/10/6 18:24
 */

@Data
@AllArgsConstructor
public class User {
    private String name;
    // 手机号
    private String phone;
    // 年龄
    private Integer age;

}
