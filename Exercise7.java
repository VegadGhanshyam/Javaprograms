package com.company;
import java.util.*;
public class Exercise7 {
    public static void main(String[] args){
        String str="12/09/2022";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{04}"));

        String str1="abc@bcd#zxr";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]",""));

        String str2="abc  def   ghi";
        System.out.println(str2.replaceAll("\\s+"," "));

    }
}
