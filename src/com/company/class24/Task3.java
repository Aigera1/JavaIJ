package com.company.class24;

public class Task3 {
    static void sayHello() {
        System.out.println("Hello there");
    }

    static void sayHello(String name) {
        System.out.println("Hello"+name);
    }
    static  void sayHello(String name, int times){
        for(int i=0; i<times;i++){
            System.out.println("Hello"+name);
        }


    }

    public static void main(String[] args) {
        sayHello("Ayge",5);
    }
}
