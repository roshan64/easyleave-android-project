package com.spark.easyleave;

public class User {
    String userName;
    int userId;
    String emailId;
    String password;
    String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String userName, int userId, String emailId, String password, String address) {
        this.userName = userName;
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.address = address;
    }
}