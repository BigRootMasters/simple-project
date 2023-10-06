package com.li.simpleproject.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author kuan
 */

@AllArgsConstructor
@Getter
public enum ValidEnum {

    VALID("VALID", "有效"), INVALID("INVALID", "无效");

    private final String code;
    private final String desc;


}
