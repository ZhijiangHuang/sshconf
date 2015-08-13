package com.zhi.entity;

/**
 * Created by root on 2015-8-13.
 */
public class MessageStore {
    private String message;
    public MessageStore(){
        setMessage("Hello Struts User");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
