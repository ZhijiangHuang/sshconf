package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 2015-8-16.
 */
public class AuthAction extends ActionSupport implements SessionAware{
    private String username;
    private Map<String,Object> seesion;
    @Override
    public String execute() throws Exception {
        seesion.put("username",username);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        seesion = map;
    }



}
