package com.company.class16;

public class Task4 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word?
         */
        String str = "This is sentence that I want to reverse";
        String[] arr = str.split(" ");
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder=new StringBuilder(arr[i]);
            stringBuilder.reverse();
            arr[i]=stringBuilder.toString();
        }
        System.out.println(arr[0]);
    }
}
