package Shorting;

import java.util.Comparator;

class Name implements Comparator {
    public int compare(Object o, Object o1){
        Prominent p1=(Prominent)o;
        Prominent p2=(Prominent)o1;
        return p1.compareTo(p2.name);
    }
}