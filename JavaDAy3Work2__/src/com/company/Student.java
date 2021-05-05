package com.company;

public class Student extends User {

    private String Comment;
    private String RegisterCourse;

    public Student(){

    }


    public Student(int id, String userId, String userName, String lastName, String firstName, String mail, String comment, String registerCourse) {
        super(id, userId, userName, lastName, firstName, mail);
        setComment(comment);
        setRegisterCourse(registerCourse);
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getRegisterCourse() {
        return RegisterCourse;
    }

    public void setRegisterCourse(String registerCourse) {
        RegisterCourse = registerCourse;
    }
}

