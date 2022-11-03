package Phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactList {
    public static void main(String[]args){
        Map<String,Long> t=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How may number you want to store?");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter name");
            String name=sc.next();
            System.out.println("Enter number");
            long number=sc.nextLong();
            t.put(name,number);
        }
        System.out.println("To find contact, enter the name");
        while(sc.hasNext()){

            String name = sc.next();
            if(t.containsKey(name)==true){
                System.out.println(name+" "+t.get(name));
            }else{
                System.out.println("Not Found");
            }
        }sc.close();
    }
}

