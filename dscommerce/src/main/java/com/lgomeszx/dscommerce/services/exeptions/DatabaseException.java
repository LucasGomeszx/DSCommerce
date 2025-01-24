package com.lgomeszx.dscommerce.services.exeptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
