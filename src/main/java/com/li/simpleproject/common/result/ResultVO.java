package com.li.simpleproject.common.result;

import com.li.simpleproject.common.enums.ResultCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author kuan
 * @version 1.0
 * @description: 自定义响应体
 * @date 2023/10/6 18:48
 */

@Setter
@Getter
public class ResultVO<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 8139084312635252314L;
    /**
     * 状态码
     */
    private int code;
    /**
     * 响应信息，用来说明响应情况
     */
    private String msg;
    /**
     * 响应的具体数据
     */
    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
