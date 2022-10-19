package com.company;
import java.util.Arrays;

/*subarrays*/
public class practiceW1 {

    public static void main(String[] args) {

        String[] arr=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l"};
        int start=4,end=9;
        String[] subarr=new String[end-start+1];
        for(int i=0;i<subarr.length;i++)
        {
            subarr[i]=arr[start+i];
        }
        System.out.println(Arrays.toString(subarr));
    }
}