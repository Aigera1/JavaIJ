package com.company.class24;

public class Overloading {
    void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method with String []args ");
        main("Hello");
        main(10) ;
    }
    public static void main(String args) {
        System.out.println("Inside main method with String args ");

    }
    public static void main(int args) {
        System.out.println("Inside main method with String args ");
    }
}
