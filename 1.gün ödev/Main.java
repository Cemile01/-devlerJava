package com.company;
public class Main {

    public static void main(String[] args) {


        CourseList courseList = new CourseList(1 , "JAVA&REACT KURSU" , "YAZILIMCI YETİŞTİRME");
        CourseList courseList1 = new CourseList(2 , "ALGORİTMA" , "SIFIRDAN YAZILIMCI OLMA");


        Category category = new Category("Kategori:" , "programlama");

        Category[] categories = {category};
        for (Category category1 : categories) {
            System.out.println(category.CategoryName+ " " + category.branch);
        }

        CourseList[] lists = {courseList , courseList1};

        for (CourseList list : lists) {
            System.out.println("KAMP İÇERİĞİ : " + list.Cname + " " + list.detail);
        }

        ManagerCourse managerCourse = new ManagerCourse();
        managerCourse.addToCourse(courseList);

        ManagerCourse managerCourse1 = new ManagerCourse();
        managerCourse1.finisisCourse(courseList1);







    }
}
