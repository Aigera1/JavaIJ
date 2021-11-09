package com.company.class17;

public class AccessModifierDemo1Tester {
    public static void main(String[] args) {
        AccessModifierDemo1 accessModifierDemo1=new AccessModifierDemo1();
        //System.out.println(accessModifierDemo1.name); can not access because field is private
        System.out.println(accessModifierDemo1.age);
    }
}
