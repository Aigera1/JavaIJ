package com.company.class24;

public class Employee {

    String name;
    double salary;
    Employee(String name,double salary){
        this.salary=salary;
        this.name=name;
    }
    void getPaid(){
        System.out.println(name+" is getting paid"+ salary+ "/anum");
    }
}
class Contractor extends Employee{
    Contractor(String name,double salary){
        super(name,salary);
    }

    @Override
    void getPaid() {
        System.out.println(name+" is getting paid"+ salary+" /hourly");

    }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, double salary){
        super(name,salary);
    }

    public static void main(String[] args) {
       // FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("Aigera",100000):
        //FullTimeEmployee.getPaid();
        //Contractor contractor=new Contractor("Azat",45);
        //FullTimeEmployee.getPaid();

    }
}