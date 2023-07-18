package Challenges;

public class ReverseNumber {


    public static int reserveNumber(int number){
        int reverse = 0, remainder =0;
        String rev = new String();
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }





        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reserveNumber(-1234));
//        int n = 1234;
//        System.out.println(n/10);
    }
}
