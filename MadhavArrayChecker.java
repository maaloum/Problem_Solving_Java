package Challenges;

public class MadhavArrayChecker {
    public static boolean isMadhavArray(int[] arr) {
        int n = arr.length;
        int i = 1; // Start from index 1 since index 0 represents the number of subsequences

        while (i < n) {
            int subsequenceLength = arr[0];
            int subsequenceSum = 0;

            for (int j = i; j < i + subsequenceLength; j++) {
                if (j >= n) {
                    // Invalid subsequence length, array does not satisfy the Madhav property
                    return false;
                }
                subsequenceSum += arr[j];
            }

            if (subsequenceSum != arr[i]) {
                // Sum of subsequence elements does not match the corresponding element in the array
                return false;
            }

            i += subsequenceLength;
        }

        // If all subsequences satisfy the Madhav property, return true
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] arr2 = {2,1,1,4,-1,-1};
        boolean isMadhav = isMadhavArray(arr);
        boolean isMadhav2 = isMadhavArray(arr);
        System.out.println("Is Madhav array: " + isMadhav);
        System.out.println("Is Madhav array: " + isMadhav2);

    }
}
