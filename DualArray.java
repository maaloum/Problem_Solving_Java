package Challenges;

public class DualArray {

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2}));
//        System.out.println(isDual(new int[]{2, 5, 2, 5, 5} ));
    }


//    Every value in this array should occur twice {1, 2, 1, 3, 3, 2} is dual
    public static int isDual(int[]a ){

        for (int i = 0; i < a.length-1; i++) {
            int count =0;
            for (int j = 0; j < a.length; j++) {
                    if(a[i] == a[j]){
                        count++;
                    }
            }
            System.out.println("count" + count);
            if(count != 2){
                return 0;
            }
        }


        return 1;

    }
}
