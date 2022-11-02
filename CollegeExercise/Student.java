package CollegeExercise;

import java.util.Comparator;

public class Student implements Comparable{
    private int id;
    private String name;
    private String college;
    private String grade;

    public  Student(int i,String n,String c,String g){
        id = i;
        name=n;
        college=c;
        grade=g;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return id+" "+name+" "+college+" "+grade;
    }

    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        return this.getName().compareTo(s.getName());
    }
}

class Id implements Comparator<Student>
{
    public int compare(Student s1, Student s2) {
        return s1.getId()-s2.getId();
    }
}
class Name implements Comparator<Student>
{
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class College implements Comparator<Student>
{
    public int compare(Student s1, Student s2) {
        return s1.getCollege().compareTo(s2.getCollege());
    }
}




