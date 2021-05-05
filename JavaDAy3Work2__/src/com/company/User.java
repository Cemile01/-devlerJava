package com.company;

public class User {
    public User(){
    }
    private int id;
    private String UserId;
    private String UserName;
    private String lastName;
    private String firstName;
    private String mail;
    public User(int id, String userId, String userName, String lastName, String firstName, String mail) {
        this.setId(id);
        setUserId(userId);
        setUserName(userName);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setMail(mail);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
