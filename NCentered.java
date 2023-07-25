package Challenges;

public class NCentered {

    public static void main(String[] args) {
        int[] a = {3,2,10,4,1,6,9};

        System.out.println(centered15(a));
    }


//    the O(n2) solution
    public static int centered15(int[] arr){
        if(arr.length == 0 ) return 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == 15 && (arr.length - j - 1 == i)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
