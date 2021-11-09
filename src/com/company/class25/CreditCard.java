package com.company.class25;

public class CreditCard {
    // Create class CreditCard and define variable balance and interest
    //Create an instance method that will calculate interest based on the given balance
    //Create 2 subclasses: Visa and AX class override method calculate interest
    // call the method by creating an object of each the three classes
    double balance;
    double interest;
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("Yearly interest is "+interest);
    }
}
class Visa extends CreditCard {
    void calculateInterest(){
        interest = balance * 0.12;
        System.out.println("Yearly interest is " + interest);
    }
}
class AX extends CreditCard{
    void calculateInterest(){
        interest = balance * 0.18;
        System.out.println("Yearly interest is " + interest);
    }

}