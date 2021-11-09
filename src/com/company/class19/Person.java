package com.company.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;
    Person(){
        name="None";
        age=38;
        weight=50;
        height=5.5;
        education = "None";
        System.out.println("Important lines of code that should always executed when creating the object of this class");
    }
    Person(String personName){
        this();// calls the number argument constructor
        name=personName;

    }
     Person(String personName,int personAge){
        this(personName);
     }
     void printInfo(){
         System.out.println("Name "+name+" age "+age+" weight "+weight+" height "+ height+" education "+ education);
     }
     Person(int personAge, String personName){
         System.out.println("2nd constructor");
         name=personName;
         age=personAge;
         weight=50;
         height=5.5;
         education = "None";
     }

}
