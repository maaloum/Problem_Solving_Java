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

//    using recursion

    public static void Reverse(int num)
    {

        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }

        else {

            // print the unit digit of the given number
            System.out.print(num % 10);

            // calling function for remaining number other
            // than unit digit
            Reverse(num / 10);
        }
    }

    public static void main(String[] args) {

//        System.out.println(reserveNumber(1));
//        int n = 1234;
//        System.out.println(n/10);

        int num = 98765;

        System.out.print("Reversed Number: ");

        // calling recursive function
        // to print the number in
        // reversed form
        Reverse(num);
    }
}
