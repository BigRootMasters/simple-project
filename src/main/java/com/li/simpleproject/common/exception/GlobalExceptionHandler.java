package com.li.simpleproject.common.exception;

/**
 * @author kuan
 * @version 1.0
 * @description: TODO
 * @date 2023/10/6 19:02
 */


import com.li.simpleproject.common.enums.ResultCode;
import com.li.simpleproject.common.result.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kuan
 * @version 1.0
 * @description: 自定义异常
 * @date 2023/10/6 19:00
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 自定义异常APIException
     */
    @ExceptionHandler(APIException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultVO<Object> apiExceptionHandler(APIException e) {
        log.error("api异常");
        return new ResultVO<>(ResultCode.FAILED, e.getMsg());
    }

    /**
     * 方法参数错误异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultVO<Object> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        log.error("方法参数错误异常");
        List<String> list = new ArrayList<>();
        // 从异常对象中拿到ObjectError对象
        if (!e.getBindingResult().getAllErrors().isEmpty()) {
            for (ObjectError error : e.getBindingResult().getAllErrors()) {
                list.add(error.getDefaultMessage());
            }
        }
        // 然后提取错误提示信息进行返回
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, list);
    }
}
