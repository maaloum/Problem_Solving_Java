package Challenges;

public class Madhav {

    public static void main(String[] args){

        System.out.println(isMadhavArray(new int[]{2,1,1}));
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));

    }

    public static int isMadhavArray(int[] a){
        int madhavLength = 0;
        int arrayLength = a.length;
        int isMadhav = 1;

        for(int i=0; i<= arrayLength; i++){
                if(arrayLength == i*(i+1)/2){
                     madhavLength = 1;
                }
        }
        if (madhavLength == 0) return 0;
        int startIndex =1;
        int round =1;
        int endIndex = startIndex + round;
        int firstElement = a[0];

        while((madhavLength == 1) && (endIndex <= arrayLength)){
            int sum =0;
            for(int i=startIndex; i<= endIndex; i++ ){
                sum += a[i];
            }
            if(firstElement != sum){
                isMadhav = 0;
            }
            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }


        return isMadhav;
    }
}
