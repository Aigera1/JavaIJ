package com.company.classreview9;

public class HumanBeing {

    String name;
    int age;
    double height;
    double weight;

    HumanBeing(){
        name="Elon Mask";
        age=46;
        height=6;
        weight=70;
    }
    HumanBeing(String humanName){
        this();
        System.out.println("Testing the constructor");
        name=humanName;

    }
    HumanBeing(String humanName, int humanAge){
        this(humanName);
        System.out.println("Testing the constructor");
        name=humanName;
        age=humanAge;

    }
    void printHumanInformation(){
        System.out.println(name+age+height+weight);
    }
}
