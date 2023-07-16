package Challenges;

//Write a function that takes an array of integers as an argument and returns a value based on the sums of the even and odd numbers in the array.
// Let X = the sum of the odd numbers in the array and let Y = the sum of the even numbers.
// The function should return X – Y

public class SumOddEven {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        System.out.println(SumOdd(array));
    }

    public static int SumOdd(int[]a){
        int sumEven =0;
        int sumOdd =0;
        for (int i = 0; i < a.length; i++) {
                if(a[i]%2 == 0){
                    sumEven += a[i];
                }else {
                    sumOdd += a[i];
                }
        }

        return sumOdd - sumEven ;
    }
}
