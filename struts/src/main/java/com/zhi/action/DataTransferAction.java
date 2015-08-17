package com.zhi.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;

/**
 * Created by root on 2015-8-17.
 */
public class DataTransferAction extends ActionSupport {
    private Double[] ages;
    private String[] names = new String[3];

    @Override
    public String execute() throws Exception {
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(names));
        return SUCCESS;
    }

    public Double[] getAges() {
        return ages;
    }

    public void setAges(Double[] ages) {
        this.ages = ages;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
