package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Swapmain {
    public static void main(String[]args){
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();


        a1.add(1);a1.add(2);a1.add(3);a1.add(5);
        a2.add(2);a2.add(7);a2.add(8);a2.add(9);
        Collections.swap(a1,0,3);
        System.out.println(a1);
        }
}
