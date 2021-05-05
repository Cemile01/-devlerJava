package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Cemile");
        user.setLastName("Temiz");
        user.setMail("erkutcemile@gmail.com");
        user.setUserId("1");
        user.setId(4);
        user.setUserName("cemile123");

        Student student = new Student();
        student.setFirstName("Cemile");
        student.setLastName("Temiz");
        student.setMail("erkutcemile@gmail.com");


        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");


        UserManager userManager = new UserManager();
        userManager.addUser(user);
        userManager.deleteUser(user);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.homeWork(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.finisCourse(student);
        studentManager.registerCourse(student);


    }

}
