package Shorting;

import java.util.Comparator;

class Dob implements Comparator<Prominent> {
    public int compare(Prominent p1, Prominent p2){
        return p1.dob-p2.dob;
    }
}