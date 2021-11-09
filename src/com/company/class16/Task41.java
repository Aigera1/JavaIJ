package com.company.class16;

public class Task41 {
    public static void main(String[] args) {
        String str = "This is sentence that I want to reverse";
        String[] arr = str.split(" ");
        StringBuilder reversed=new StringBuilder();

        for (String s:arr) {
            StringBuilder stringBuilder=new StringBuilder(s);
            stringBuilder.reverse();
          reversed.append(stringBuilder).append(" ");

        }
        System.out.println(reversed);
    }
}
