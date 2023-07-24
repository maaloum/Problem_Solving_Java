package Challenges;

import java.sql.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class AllCommonElementsOfTwoArray {

    
//    Brute force Method 
   public static int[] f(int[] first, int[] second){
        int[] arr3 = new int[first.length < second.length ? first.length : second.length];
        int k =0;
        int[] a, b;

       for (int i = 0; i < arr3.length; i++) {
           for (int j = 0; j < second.length; j++) {
               if (first[i] == second[j]) arr3[k] = first[i];
               k++;
           }
       }
        

        return arr3 = new int[k];
    }

    public static void main(String[] args) {
        int[] a2 ={1, 8, 3, 2};
          sort(a2);
        System.out.println(Arrays.toString(a2));
//        int[] a1 = {2, 6, 1};
//
//        int[] res = f(a1, a2);
//        System.out.println(Arrays.toString(res));

    }
}
