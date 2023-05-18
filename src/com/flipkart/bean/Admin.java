package com.flipkart.bean;

import java.util.Date;

public class Admin extends User{

    private Date doj;

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }
}
