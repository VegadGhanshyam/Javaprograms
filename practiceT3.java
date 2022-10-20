package com.company;

/*this keyword*/
class Student{
    public int roll;
    public String name;
    public Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Roll number is "+this.roll);
        System.out.println("Student name is "+ this.name);
    }
}
public class practiceT3 {
    public static void main(String[]args){
        Student s1=new Student(21,"Ghanshyam");
        s1.display();
    }
}
