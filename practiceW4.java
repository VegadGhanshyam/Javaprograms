package com.company;

/*stringbuilder*/
public class practiceW4 {
    public static void main(String[]arg){
        String str="java gor tutorial";
        int index=5;
        char ch='f';
        System.out.println(str);

        StringBuilder String=new StringBuilder(str);
        String.setCharAt(index,ch);
        System.out.println(String);
    }
}
