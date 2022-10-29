package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[]args){
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();


        a1.add(1);a1.add(2);a1.add(3);a1.add(5);
        a2.add(2);a2.add(7);a2.add(3);a2.add(9);
        for(int i=0;i<a1.size();i++) {
            if (a1.contains(a2.get(i))) {
                System.out.println(a2.get(i)+" is duplicate");
            }
            else{
                System.out.println(a2.get(i)+ " is distinct");
            }
        }
    }
}
