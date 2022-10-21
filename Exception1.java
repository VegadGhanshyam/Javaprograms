package com.company;
import java.util.*;

/*Custom Exception*/
class LowSalaryException extends Exception{
    public String toString(){
        return "Salary is less than 87000";
    }
}
public class Exception1{
    public static void main(String[] args){
        System.out.println("Enter_The_Salary");
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();

        if(salary<=87000){
            System.out.println("salary is "+ salary);}
        else try{
                throw new LowSalaryException();
            }
            catch(LowSalaryException e){
                System.out.println(e);
            }
    }
}
