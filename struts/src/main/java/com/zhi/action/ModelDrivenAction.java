package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhi.entity.Gangster;

/**
 * Created by root on 2015-8-14.
 * 执行顺序：getModel-->validate-->execute
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

    @Override
    public void validate() {
        System.out.println("validate invoked!");
        if (gangster.getName()==null||"".equals(gangster.getName())){
            addFieldError("name","name不能为空");
        }
    }
}
