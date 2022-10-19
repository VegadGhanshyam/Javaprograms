package com.company;

/*Student class*/
class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public int average(){
        return total()/3;
    }
    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String details(){
        return "Roll no:"+roll+"\n"+"name is:"+name+"\n"+"course is:"+course+"\n";
    }
}
public class practiceW5 {
    public static void main(String[]args){
        Student s=new Student();
        s.roll=21;
        s.name="Ghanshyam";
        s.course="Scince";
        s.m1=80;
        s.m2=70;
        s.m3=90;
        System.out.println("Total marks is "+s.total());
        System.out.println("average is "+s.average());
        System.out.println("Grade is "+s.grade());
        System.out.println(s.details());

    }
}

