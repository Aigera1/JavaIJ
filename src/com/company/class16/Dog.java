package com.company.class16;

public class Dog {
    static int noOfLegs=4;
    String name;//instance variable
    static  String Breed;// static variable
    String color;
    void bark(){
        int times=10;// local var
        for(int i=0; i<times; i++){
            System.out.println("Dog can bark");
        }
    }
}
