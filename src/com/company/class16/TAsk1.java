package com.company.class16;

public class TAsk1 {
    public static void main(String[] args) {
     /*
     Create a String that will hold a sentence. Write a program to get a new String without any spaces.
2.
3.
4. How would you reverse a String character by character?
5. How would you reverse a String word by word?
6. How would you check if String is palindrome or not?
7. How would you swap  2 strings without a temporary variable?
      */

  String str ="This is a sentence with spaces";
        System.out.println(str.replace(" ","")); //removes the space from sentence
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("\\s",""));







    }
}
