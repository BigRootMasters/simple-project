package com.li.simpleproject.common.exception;

import com.li.simpleproject.common.enums.ResultCode;
import lombok.Getter;

import java.io.Serial;

/**
 * @author kuan
 * @version 1.0
 * @description: 自定义异常
 * @date 2023/10/6 19:00
 */
@Getter
public class APIException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1102468636353493963L;

    private final int code;
    private final String msg;

    public APIException() {
        this(ResultCode.FAILED);
    }

    public APIException(ResultCode failed) {
        this.code = failed.getCode();
        this.msg = failed.getMsg();
    }
}

