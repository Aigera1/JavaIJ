package com.company.class16;

public class Student {
    static String schoolName=" Syntax";
    int courseDuration=6;
    String name;
    String id;
    int age;
    double calculateFee(){
       int var1=10;
       int var2=20;
       return var1*var2+100;
    }
    void displayFee(){
        System.out.println(name+" has to pay "+calculateFee());
    }
}
