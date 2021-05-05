package com.company;

public class Instructor extends User {

    private String adminPassword;
    private String HomeWork;

    public Instructor(){

    }


    public Instructor(int id, String userId, String userName, String lastName, String firstName, String mail, String adminPassword, String homeWork) {
        super(id, userId, userName, lastName, firstName, mail);
        this.setAdminPassword(adminPassword);
        setHomeWork(homeWork);
    }


    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getHomeWork() {
        return HomeWork;
    }

    public void setHomeWork(String homeWork) {
        HomeWork = homeWork;
    }
}