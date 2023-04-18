package Challenges;

public class PrimeCount {

    public static void main(String [] args){
        System.out.println(primeCount(10, 30));
    }
    public static int primeCount(int start, int end){
        int primeCounter = 0;
        int i = start;
        while(i<= end){
            if(isPrime(i)){
                primeCounter++;
            }
            i++;
        }
        return primeCounter;
    }

    public static boolean isPrime(int n ){
        boolean isPrime = false;
        if(n <= 1) return isPrime;
        for(int i =2; i< n/2; i++){
            if(n%i == 0){
                return isPrime;
            }
        }
        return !isPrime;

    }
}
