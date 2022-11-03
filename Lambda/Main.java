package Lamda;

import java.io.File;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args){
        try{
            Path p= Paths.get("/home/pp-5/Ghanshyam/Text11.txt");
            Stream<String> s= Files.lines(p);


            List<String> list = Files.readAllLines(new File("/home/pp-5/Ghanshyam/Text11.txt").toPath() );

            //printing element legth less than 3
            List<String>  l= s.filter(word -> word.length() <3).collect(Collectors.toList());
            l.forEach(System.out::println);

            //distinct element count
            long count= list.stream().distinct().count();
            System.out.println("Total distinct element is:"+count);

            // ditinct element print
            List<String> pcount= list.stream().distinct().collect(Collectors.toList());
            System.out.println("distinct element is:"+pcount);

        }catch(Exception e){}

    }

}

