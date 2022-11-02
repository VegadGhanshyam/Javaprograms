package CollegeExercise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) {
        Student s1 = new Student(1, "Ghanshyam", "GEC", "A");
        Student s2 = new Student(2, "Dipraj", "Sltiet", "C");
        Student s3 = new Student(3, "Dipraj", "Mu", "B");
        Student s4 = new Student(4, "Raviraj", "Mu", "A");
        Student s5 = new Student(5,"Raviraj","GEC","A");
        Student s6 = new Student(6,"Mohit","Vvp","B");
        List<Student> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);

        //unique name print
        Map<String,Student> m=new TreeMap<>();
        for(Student str:l){
            m.put(str.getName(),str);
        }
        System.out.println("unique name printing");
        System.out.println(m+"\n");

        //Name wise Shorting
        Collections.sort(l,new Name());
        System.out.println("Name wise Shorting");
        System.out.println(l+"\n");

        //college wise shorting
        Collections.sort(l,new College());
        System.out.println("College Wise Shorting");
        System.out.println(l+"\n");

        //College wise grade and student
        Map<String, Map<String, String>> map = new HashMap<>();
        for (Student student : l) {
            int counter = 0;
            if (map.containsKey(student.getCollege())) {
                Map<String, String> grade = map.get(student.getCollege());
                grade.put(student.getName(), student.getGrade());
            } else {
                Map<String, String> map1 = new HashMap<>();
                map1.put(student.getName(), student.getGrade());
                map.put(student.getCollege(), map1);
            }

        }
        System.out.println("College wise grade and student");
        System.out.println(map+"\n");


        //College wise student count
        Function<Student, String> count = student -> student.getCollege();
        Map<String, Long> m1= l.stream().collect(Collectors.groupingBy(count, Collectors.counting()));
        System.out.println("Number of students by College " );
        System.out.println(m1+"\n");

        //name,college wise shorting
        Collections.sort(l,new Name().thenComparing(new College()));
        System.out.println("name,college wise shorting");
        System.out.println(l);


    }
}

