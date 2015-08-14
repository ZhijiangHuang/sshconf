package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhi.entity.Gangster;

/**
 * Created by root on 2015-8-14.
 */
public class ModelDrivenAction extends ActionSupport implements ModelDriven {
    private Gangster gangster;

    @Override
    public String execute() throws Exception {
        System.out.println(gangster);
        return SUCCESS;
    }

    @Override
    public Object getModel() {
        System.out.println("model");
        gangster = new Gangster();
        return gangster;
    }
}
