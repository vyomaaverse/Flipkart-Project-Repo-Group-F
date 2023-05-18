package com.flipkart.bean;

public class NetBanking extends Online{
    private String modeOfTransfer;
    private int accountNumber;
    private String ifscCode;

    public String getModeOfTransfer() {
        return modeOfTransfer;
    }

    public void setModeOfTransfer(String modeOfTransfer) {
        this.modeOfTransfer = modeOfTransfer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}
