package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[]args){
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        HashSet<Integer> h1=new HashSet<Integer>();

        a1.add(4);a1.add(2);a1.add(3);a1.add(5);
        a2.add(2);a2.add(7);a2.add(3);a2.add(9);
        h1.addAll(a1);
        h1.addAll(a2);
        System.out.println(h1);
        }
}
