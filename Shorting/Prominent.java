package Shorting;

class Prominent implements Comparable{
    String name;
    int id;
    int age;
    int dob;
    public Prominent(String n,int i, int a, int d){
        id=i;
        name=n;
        age=a;
        dob=d;
    }
    public String toString(){
        return "ID:"+id+" "+"Name:"+name+" "+"AGE:"+age+" "+"DOB:"+dob;
    }

    @Override
    public int compareTo(Object o) {
        Prominent p=(Prominent)o;
        return name.compareTo(p.name);
    }
}