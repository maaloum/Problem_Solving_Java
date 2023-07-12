package Challenges;


/*
* [1,3,45,6,7,8,43]
* this function looks to find the sum of the k consecutive items
* k =2  => sum = 8+43 = 51;
*
* */
public class SlidingWindow {

    public static void main(String[] args) {

        int [] inputs = {5,1,3,2,11,5,7,8};
        System.out.println(inputs.length - 3 );
        System.out.println(maxSumCons(inputs, 3));

    }

//    Brute force method to calculate the sum of a subArray
    public static int subArraySum(int[] subArray, int size){
        int max_sum = Integer.MIN_VALUE;

        // Consider all blocks starting with i.
        for (int i = 0; i < subArray.length - size + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < size; j++)
                current_sum = current_sum + subArray[i + j];

            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }

//    Using sliding window approach
    public static int maxSumCons(int[]a, int size){
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
        for (int i = 0; i < size; i++) {
            currentSum += a[i];
        }
//        System.out.println("current sum " + currentSum);
        for (int i = size; i < a.length; i++) {
            currentSum = currentSum - a[i-size] + a[i];
            System.out.println("current sum " + currentSum);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
