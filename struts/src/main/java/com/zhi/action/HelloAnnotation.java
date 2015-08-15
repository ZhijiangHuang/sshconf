package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by root on 2015-8-15.
 */

@ParentPackage("struts-default")
@Action(value = "annotation", results = {
        @Result(name = "success", location = "/annotation.jsp"),
//        @Result(name = "error", type = "json", params = { "excludeProperties","adminMgr" })
})
public class HelloAnnotation extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("annotation invoked!");
        return SUCCESS;
    }
}
