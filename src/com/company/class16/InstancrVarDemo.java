package com.company.class16;

public class InstancrVarDemo {
    int[] arr={10,20,30,50};
    int sum=0;
    void sum(){


        for(int i:arr){
            sum+=i;
        }
    }
    void calculateAverage(){
        System.out.println(sum/arr.length);
    }
}
