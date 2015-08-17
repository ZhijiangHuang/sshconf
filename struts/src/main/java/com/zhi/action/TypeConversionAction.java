package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * Created by root on 2015-8-17.
 */
public class TypeConversionAction extends ActionSupport{
    private Date birthday;

    @Override
    public String execute() throws Exception {
        System.out.println(birthday);
        return SUCCESS;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
