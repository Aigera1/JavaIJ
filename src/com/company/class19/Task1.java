package com.company.class19;

public class Task1 {

    String address;
    Task1(){
        System.out.println("No argument constructor");
    }
    Task1(String address){
       this.address=address;
        System.out.println("argument constructor");
    }
}
