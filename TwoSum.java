package Challenges;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,3,4,5}, 6)));
    }
    static int [] twoSum(int[]a, int target){
//        define pointers
        int left =0, right = a.length -1, i =0;

      while(left < right){
            int sum = a[left] + a[right];
          System.out.println(sum);
            if(sum == target) {
                return new int[]{ left, right};
            } else if (sum < target) {
                left++;
            }else {
                right++;
            }

      }
      return new int[]{-1,-1};
    }
}
