package Challenges;

public class LargestAdjacentSum {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4};
        int[] a2 = {18,-12,9,-10};
        int[] a3 = {1,1,1,1,1,1,1,1};
        int[] a4 = {1,1,1,1,2,1,1,1};


        System.out.println(largestAdjacentSum(a1));
        System.out.println(largestAdjacentSum(a2));
        System.out.println(largestAdjacentSum(a3));
        System.out.println(largestAdjacentSum(a4));
    }

    public static int largestAdjacentSum(int[]a){
        int largestSum = Integer.MIN_VALUE;
        int currentSum =0;
//        for (int i = 0; i < a.length; i++) {
//                currentSum += a[i];
//                if(i >= 1 ){
//                    largestSum = Math.max(currentSum, largestSum);
//                    currentSum -= a[i - 1];
//                }
//        }

        for (int i = 0; i < a.length - 1; i++) {
            currentSum =a[i] + a[i+1];
            if(currentSum > largestSum){
                largestSum = currentSum;
            }
        }
        return largestSum;

    }
}
