package Challenges;

import java.awt.*;

public class isCenterted {

    public static void main(String[] args){
        System.out.println(isCenterted(new int[] {3, 2, 1, 4, 1}));
    }

    public static int isCenterted(int[]a ){
        int midIndex = a.length/2;
        System.out.println(a[midIndex]);
        if(a == null || a.length % 2 == 0)  return 0;
        for(int i = 0; i< a.length; i++){
            if( i != midIndex && a[i] <= a[midIndex]){
                return 0;
            }
        }
        return 1;

    }
}
