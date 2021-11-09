package com.company.class28.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Abdul");
        list.add("Michael");
        list.add("Abdul");
        list.add("Sule");
        list.add("Aige");
        list.add("Abdul");

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Michael");
        list1.add("Aige");
        list1.add("Abdul");
        list.removeAll(list1);
        System.out.println(list);

    }
}
