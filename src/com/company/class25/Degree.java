package com.company.class25;

public class Degree {
// create a class"Degree" having method "getPrerequiste" that prints "To get a degree you need high school diploma"
    //Class "Degree" has 2 subclasses namely "Bachelors" and Masters/ In Master class override method getPrerequiste"
    void getPrerequiste(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class  Masters extends Degree{
    @Override
    void getPrerequiste(){
        System.out.println("To get a Master degree you need Bachelor diploma");
    }
}