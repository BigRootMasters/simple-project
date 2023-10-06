package com.li.simpleproject.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author kuan
 */

@Getter
@AllArgsConstructor
public enum DeleteEnum {

    NOT_DELETED("NOT_DELETED", "未删除"), DELETED("DELETED", "已删除");

    private final String code;
    private final String desc;
}
