package com.arcmine.exception;

import com.arcmine.domain.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseResult handlerException(Exception e) {
        String msg = e.getMessage();
        ResponseResult result = new ResponseResult(300, msg);
        return result;
    }
}
