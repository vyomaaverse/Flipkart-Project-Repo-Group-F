package com.flipkart.bean;

public class PaymentNotification {
    private int studentId;
    private int refreneceID;
    private int notificationID;
    private String notificationMessage;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getRefreneceID() {
        return refreneceID;
    }

    public void setRefreneceID(int refreneceID) {
        this.refreneceID = refreneceID;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
