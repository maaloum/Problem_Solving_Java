package Challenges;

public class LargAdjSum {

    public static void main(String[] args) {
        System.out.println(largestAdjecentSum(new int[]{18,-12,9,-10})); // return 7

    }



    public static int largestAdjecentSum(int[] array){
        int largestSum =0;
        for (int i = 0; i < array.length -1 ; i++) {
            if(array[i] + array[i +1] > largestSum){
                largestSum = array[i] + array[i +1];
            }
        }




        return largestSum;
    }
}
