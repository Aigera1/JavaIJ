package com.company.class16;

public class StudentTester {
    public static void main(String[] args) {
        Student  student1=new Student();
        student1.name="Aigerim";
        student1.age=29;
        student1.id="123";
        student1.displayFee();
        Student.schoolName="Syntax tech";
        System.out.println(Student.schoolName);
        Student  student2=new Student();
        student2.name="Marya";
        student2.age=23;
        student2.id="2345";
        System.out.println(Student.schoolName);
    }
}
