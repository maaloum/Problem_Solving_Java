package Challenges;

import java.util.Arrays;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(henry(1,2));
    }

    public static int henry(int i, int j){
        int[] perfectNumbers = new int[j];
        int num =1;
        int count =0;
        while(count < j){
            if(isPerfectNumber(num)){
                perfectNumbers[count] = num;
                count++;
        }
            num++;
        }
        return perfectNumbers[i - 1] + perfectNumbers[j - 1];
    }

    public static boolean isPerfectNumber(int num){
        int sum =0;
        for (int i = 1; i <= num/2; i++) {
            if(num%i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
