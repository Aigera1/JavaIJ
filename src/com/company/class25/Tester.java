package com.company.class25;

public class Tester {
    public static void main(String[] args) {
        Employee employee=new Employee("Aigerim");
        employee.performDailActivities();
        Student student=new Student("Sharif");
        student.performDailActivities();
        Teacher teacher=new Teacher("Mary");
        teacher.performDailActivities();
    }

}
