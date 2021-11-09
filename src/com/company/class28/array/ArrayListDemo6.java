package com.company.class28.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Abdul");
        list.add("Michael");
        list.add("Abdul");
        list.add("Sule");
        list.add("Aige");
        list.add("Abdul");
        System.out.println(list);
        System.out.println(list.remove("Abdul"));
        System.out.println(list);
        //while (list.remove("Abdul")){
        //}

        ArrayList<String> name=new ArrayList<>();
        name.add("Abdul");
        list.removeAll(name);




        //for(int i=0; i< list.size(); i++){
            //if(list.get(i).equals("Abdul")){
               // list.remove(i);
            //}
       // }
                System.out.println(list);
    }
}
