package Shorting;

import java.util.Comparator;

class ID implements Comparator<Prominent> {
    public int compare(Prominent p1, Prominent p2){
        return p1.id-p2.id;
    }
}