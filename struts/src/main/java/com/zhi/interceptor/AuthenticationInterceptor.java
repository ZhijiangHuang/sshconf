package com.zhi.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by root on 2015-8-16.
 */
public class AuthenticationInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map session = actionInvocation.getInvocationContext().getSession();
        String username = (String) session.get("username");
        if (username == null){
            return "input";
        }
        return actionInvocation.invoke();
    }
}
