package com.RemoteMode.HotelReservationProject;

public class User {

    private String userName;
    private String userPassword;
    private List<User> userList;


    publics User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
        userList.add(this);
    }

    public List<User> getUserList() {
        return userList;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}