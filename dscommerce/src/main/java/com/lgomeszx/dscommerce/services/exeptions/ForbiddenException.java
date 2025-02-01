package com.lgomeszx.dscommerce.services.exeptions;

public class ForbiddenException extends RuntimeException{

    public ForbiddenException(String msg) {
        super(msg);
    }
}
