package CollegeData;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        College c1 = new College("ghanshyam","gec","A");
        College c2 = new College("dipraj","atmiya","c");
        College c3 = new College("raviraj","mu","B");

        List<College> l1=new LinkedList<>();
        l1.add(c1);
        l1.add(c2);l1.add(c3);

//Shorting name
        Collections.sort(l1);
        System.out.println("Shorting name");
        System.out.println(l1);

//Reverce order
        System.out.println("Printing in reversae order");
        Collections.reverse(l1);
        System.out.println(l1);

//Convert in map
        Map<String,College> m1=new HashMap<>();
        for (College stu:l1){
            m1.put(stu.name,stu);
        }
        System.out.println("Print map");
        System.out.println(m1);

//Convert in set & count
        Set<College> s1=new HashSet<>(l1);
        Collections.addAll(s1);
        int size=s1.size();
        System.out.println("Number of elements is "+size);
        System.out.println(s1);


    }
}
