package com.company.class28.array;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create Arraylist that will store 5 names into it
        ArrayList<String> name=new ArrayList<>();
        name.add("Mars");
        name.add("Mar");
        name.add("Ma");
        name.add("Marss");
        name.add("M");
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Sule"));
        System.out.println(name.contains("Mars"));
        System.out.println(name.contains("Sule"));
    }
}
