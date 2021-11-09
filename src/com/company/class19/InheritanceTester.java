package com.company.class19;

public class InheritanceTester {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.eat();
        Tester tester1=new Tester();
        tester1.name="Ayge";
        tester1.eat();
        tester1.testCode();
    }
}
