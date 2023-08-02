package Challenges;

public class SumFactor {

//    Sum factor of an array is the number of time the sum of an array appears as element of it
//    [1,-1,1,-1,1,-1,1] => sum= 1 and it appears 4 times => res = 4;


    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{3,0,2,-5,0}));
        System.out.println(sumFactor(new int[]{9,-3,3,-1,-1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0,0,0}));
    }

    public static int sumFactor(int[] a){
        int sumFac = 0;
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(sum == a[i]){
                sumFac++;
            }
        }

        return sumFac;
    }
}
