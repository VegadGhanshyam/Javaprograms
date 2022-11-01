package CollegeData;

public class College implements Comparable {
    String name;
    String college;
    String grade;
    public College(String n,String c,String g){
        name = n;
        college=c;
        grade=g;
    }
    public String toString(){
        return "Name:"+name+" "+"College:"+college+" "+"Grade is:"+grade+"\n";}

    @Override
    public int compareTo(Object o) {
        College c=(College)o;
        return name.compareTo(c.name);
    }
}

