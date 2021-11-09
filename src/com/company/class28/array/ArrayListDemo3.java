package com.company.class28.array;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("xzvc");
        arrayList.add("Aige");
        arrayList.add("Tes");
        arrayList.add("Aige");
        arrayList.add("Jam");
        arrayList.add("Aige");
        System.out.println(arrayList);
        arrayList.remove("Aige");
        System.out.println(arrayList);
        arrayList.add(2, "Serge");
        System.out.println(arrayList);

    }
}
