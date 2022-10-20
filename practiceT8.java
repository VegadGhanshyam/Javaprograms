package com.company;

/*inheriantance concept*/
class Member{
    String name,address;
    int age;
    double salary;
    long phoneno;
    public  double printsalary(double salary){
        return this.salary=salary;
    }
}

class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
public class practiceT8 {
    public static void main(String[] args) {
        Member m1=new Member();
        System.out.println("member m1 salary is "+m1.printsalary(1245)+"\n");
        Employee emp1=new Employee();
        emp1.salary=18500;
        emp1.age=25;
        emp1.address="ahmedabad";
        emp1.name="vegad";
        emp1.phoneno=144452720;
        emp1.specialization="java programing";

        Manager m=new Manager();
        m.age=12;
        m.address="Rajkot";
        m.name="Ghanshyam";
        m.phoneno=1245241234;
        m.salary=20120;
        m.department="IT";
        System.out.println("Employee details as below"+"\n"+"name is:"+emp1.name+"\n"+"age is:"+emp1.age+"\n"+"Phone Number is:"+emp1.phoneno+"\n"+"address is:"+emp1.address+"\n"+"Salary is:"+emp1.salary+"\n"+"Specialization is "+emp1.specialization+"\n");
        System.out.println("Manager details as below"+"\n"+"name is:"+m.name+"\n"+"age is:"+m.age+"\n"+"Phone Number is:"+m.phoneno+"\n"+"address is:"+m.address+"\n"+"Salary is:"+m.salary+"\n"+"Department is "+m.department);
    }
}
