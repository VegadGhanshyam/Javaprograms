package Shorting;

import java.util.Comparator;

class Age implements Comparator<Prominent> {
    public int compare(Prominent p1, Prominent p2){
        return p1.age-p2.age;
    }
}