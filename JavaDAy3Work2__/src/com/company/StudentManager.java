package com.company;

public class StudentManager {
    public void registerCourse(Student student){
        System.out.println("tebrikler  kursa kayıt oldun" +student.getFirstName());
    }
    public void finisCourse(Student student){
        System.out.println("Kursu başarı ile bitirdiniz" + student.getFirstName());
    }
}
