package Challenges;

public class nUpCount {

    public static void main(String[] args){
        int[] array = {2,3,1,-6,8,-3,-1,2};
        System.out.println(upCount(array, 5));
        int[] array2 = {6,3,1};
        System.out.println(upCount(array2, 6));

    }

    public static int upCount(int[] a , int n){
        int upCount =0;
        int previousSum = 0;
        int partialSum = 0;
        for(int i =0; i< a.length; i++){
            previousSum = partialSum;
            partialSum += a[i];
            if(previousSum <= n && partialSum > n){
                upCount++;
            }
        }
        return upCount;
    }
}
