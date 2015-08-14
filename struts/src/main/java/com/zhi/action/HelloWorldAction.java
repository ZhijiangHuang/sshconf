package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhi.entity.MessageStore;

/**
 * Created by root on 2015-8-13.
 */
public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    @Override
    public String execute() throws Exception {
        System.out.println("hello world");
        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
