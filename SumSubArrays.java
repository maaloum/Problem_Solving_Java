package Challenges;

public class SumSubArrays {

    public static void main(String[] args) {
        int[] a = {1,2,34,4,8,6,4};

        System.out.println(sumSubArray(a, 3));
    }

    static int sumSubArray(int[]a, int target){
        int maxSumSeen = Integer.MIN_VALUE, windowSum =0;

        for (int i = 0; i < a.length; i++) {
            windowSum += a[i];
            System.out.println("WindowSum " + windowSum);
            if(i >= target -1){
                maxSumSeen = Math.max(windowSum, maxSumSeen);
                windowSum -= a[i - (target -1)];
            }
        }

        return maxSumSeen;
    }
}
