package Challenges;

import java.util.ArrayList;

public class GuthrieIndex {
    public static void main(String[] args) {
        System.out.println(GuthrieSequenceGenerator(1));
        System.out.println(GuthrieSequenceGenerator(2));
        System.out.println(GuthrieSequenceGenerator(3));
        System.out.println(GuthrieSequenceGenerator(4));
        System.out.println(GuthrieSequenceGenerator(42));
    }
    public static int GuthrieSequenceGenerator(int n){
        ArrayList<Integer> gutherieSequence = new ArrayList<>();
        if(n < 0 ) return 0;
        while(n != 1) {
            if (n % 2 == 0) {
                gutherieSequence.add(n = n / 2);

            } else {
                gutherieSequence.add(n = (n * 3) + 1);
            }
        }

        return gutherieSequence.size();

    }
}
