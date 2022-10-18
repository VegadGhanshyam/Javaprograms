package com.company;
import java.util.*;

/*Check person young or not*/

public class Exercise15 {

    public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	//even odd
	int n=sc.nextInt();
	if(n%2==0)
		System.out.println("number is even");

	    else
            System.out.println("number is odd");
	    //person young or not
	    System.out.println("Enter person age");

	    int age=sc.nextInt();
	    if(age>14 && age<40)
	    	System.out.println("person is young");
			else
			System.out.println("person is not young");

    }
    }
