package com.imooc.apigateway.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {


    ;
    private Integer code;
    private  String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
