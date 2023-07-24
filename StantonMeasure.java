package Challenges;

public class StantonMeasure {


    public static void main(String[] args) {
        int[] a = {1,4,3,2,1,2,3,2};
        int[] b = {1};
        int[] c = {0};
        int [] d ={3,1,1,4};
        System.out.println(stantonMeasure(a));
        System.out.println(stantonMeasure(b));
        System.out.println(stantonMeasure(c));
        System.out.println(stantonMeasure(d));
    }

    public static int stantonMeasure(int [] a){
        int stantonMeasure = 0;
        int n =0; // number of ones

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                n++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == n) stantonMeasure++;
        }

        return stantonMeasure;
    }
}
