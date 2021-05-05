package com.company;

public class UserManager {
    public void addUser(User user){
        System.out.println("adlı üye eklendi:" + user.getUserName());
    }

    public void deleteUser(User user){
        System.out.println("adlı üye silindi:" + user.getUserName());
    }
}
