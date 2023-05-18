package com.flipkart.bean;

public class Payment {
    private int studentId;
    private int refrenceId;
    private float amount;
    private boolean status;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getRefrenceId() {
        return refrenceId;
    }

    public void setRefrenceId(int refrenceId) {
        this.refrenceId = refrenceId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
