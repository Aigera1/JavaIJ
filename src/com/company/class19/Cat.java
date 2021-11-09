package com.company.class19;

public class Cat {
    String name;
    int age;
    double height;
    double weight;
    Cat(String name, int age, double height, double weight){
      this.name= name;
       this.age=age;
       this.height=height;
       this.weight=weight;
       this.printInfo();;
    }
    void printInfo(){
        String name="Local var";
        System.out.println("Name "+this.name+ " age "+age+" Height "+height+" Weight " + weight);
    }

}
