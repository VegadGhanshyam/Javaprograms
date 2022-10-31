package Shorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prominent t1=new Prominent("vegad",1,23,5);
        Prominent t2=new Prominent("ghanshyam",2,22,4);
        Prominent t3=new Prominent("dd",3,25,9);
        Prominent t4=new Prominent("rr",4,21,10);

        List<Prominent> l1=new ArrayList<>();
        l1.add(t1);
        l1.add(t2);
        l1.add(t3);
        l1.add(t4);
        System.out.println(l1);

        //shorting name
        System.out.println("After Shorting name");

        Collections.sort(l1);
        System.out.println(l1);

        //shorting ID
        System.out.println("After Shorting ID");

        Collections.sort(l1,new ID());
        System.out.println(l1);

        //shorting Age
        System.out.println("After Shorting Age");

        Collections.sort(l1,new Age());
        System.out.println(l1);

        //shorting DOB
        System.out.println("After Shorting DOB");

        Collections.sort(l1,new Dob());
        System.out.println(l1);

    }
}
