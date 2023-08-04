package Challenges;

public class MeeraArray {


    public static void main(String[] args) {
        System.out.println(isMeeraArray(new int[]{-4, 0, 1, 0, 2}));
        System.out.println(isMeeraArray(new int[]{-1, 0, 0, 8, 0}));
    }

    public static int isMeeraArray(int[] a){

        for (int i = 0; i < a.length; i++) {
            if(a[i] >= i){
                return 0;
            }
        }
        
        return 1;
    }

}
