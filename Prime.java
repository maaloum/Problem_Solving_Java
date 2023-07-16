package Challenges;

public class Prime {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int n){
        boolean isPrime = false;

        if(n<=1) return isPrime;
        for (int i = 2; i < n/2; i++) {
            if(n%i == 0) return isPrime;
        }
        return !isPrime;
    }
}
