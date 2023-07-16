package Challenges;


//An array with an odd number of elements is said to be centered if all elements (except the middle one)
// are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element.
// Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.

public class centeredArray {

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {3, 2, 1, 4, 5};
        System.out.println(isCenterted(arr3));
    }

//    find the mid 
    public static int isCenterted(int[]a){
        int isCentred =0;
        if(a.length %2 ==0 && a == null) return isCentred;
        int midIndex = (a.length)/2;
        for (int i = 0; i <a.length ; i++) {
            if(i != midIndex && a[i] <= a[midIndex]){
                return isCentred;
            }
        }

        return 1;
    }

}
