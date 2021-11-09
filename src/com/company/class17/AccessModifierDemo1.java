package com.company.class17;

public class AccessModifierDemo1 {
    private String name;
    int age;
    void method1(){
        System.out.println(name);
        System.out.println(age);
    }

    void method2(){
        System.out.println(name);
        System.out.println(age);
        method1();



    }
    public static void main(String[] args) {
        //System.out.println(name);
        AccessModifierDemo1 accessModifierDemo1=new AccessModifierDemo1();
        System.out.println(accessModifierDemo1.name);
        System.out.println(accessModifierDemo1.age);
        accessModifierDemo1.method1();
    }
}
