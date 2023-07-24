package Challenges;

public class ConcatenatedSum {

    public static void main(String[] args) {
        System.out.println(concatenatedSum(198, 2));
    }


    public static int concatenatedSum(int n , int catlen){
        int digit = 0;
        int sumTot = 0;
        int number =n;
        while (n != 0){
            digit = n%10;
            int sumCatlen =0;
            for (int i = 0; i < catlen; i++) {
                sumCatlen = sumCatlen*10 + digit;
            }
             sumTot += sumCatlen;
            n = n/10;
        }


        return sumTot == number ? 1 : 0;
    }

}


