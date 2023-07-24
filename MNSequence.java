package Challenges;

import java.util.Arrays;
//Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and n inclusive.
// Furthermore, the array must be in ascending order and contain only those integers. For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range. And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
//
//Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns 0.
//
//Java the function signature is int isSequencedArray(int[ ] a, int m, int n)
//
//int isSequencedArray(int a[ ], int len, You may assume that m<=n Examples
//
//int m, int n) where len is the number of elements in the array a.


public class MNSequence {

    public static void main(String[] args) {
        int [] a = {2,2,3,4,5};
        int [] b = {2, 2, 3, 5, 5, 5};
        int [] c = {1,1, 3, 2, 2, 4};
        int [] d = {0, 2, 2, 3, 3};

        System.out.println(isSequencedArray(a, 2,5));
        System.out.println(isSequencedArray(b, 2,5));
        System.out.println(isSequencedArray(b, 1,4));
        System.out.println(isSequencedArray(d, 2,3));


    }
//For example, {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array.
// The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it is missing a 4.
// The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range.
// And {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.

//     algo :
//    check if m = a[0] and n = a[a.length-1]
//     create an array newArray of length n-m+1 and feed it with all elements in between m-n
//    check if the array is in ascending order
//

    public static int isSequencedArray( int [] a, int m, int n){

        if(a[0] != m || a[a.length -1] != n) return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]> a[i+1] || (a[i+1] - a[i]) != 1 && (a[i+1] - a[i]) != 0){
                    return 0;
            }
        }
        return 1;
    }
}
