package Challenges;

public class Porcupine {

    public static void main(String[] args) {
        int number = 139;

        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(139));

    }

//    final function to find porcupine number
    public static int findPorcupineNumber(int n){
        int por = n;
        boolean found = false;
        while(!found){
                por++;
                if(findPorcupine(por) == 1) {
                    found =true;
                }
        }
        return por;
    }
//    check if a number is verifying the porcupine conditions returns 1 if it is and 0 else
    public static int findPorcupine(int n){
        int porcupine =0;
        int nextPrime = findNextPrimeNumber(n);
        if(isPrime(n) && (checkLastElement(nextPrime) == 1) && (checkLastElement(n) ==1)){
                    porcupine =1;
                }
        return porcupine;
    }

//    check if the last element is = 9
    public static int checkLastElement(int number){
        int verified =0;
        if(number%10 == 9){
            verified =1;
        }

        return verified;
    }

    // check if the number is Prime
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
// function to find the next prime number
    public static int findNextPrimeNumber(int n){
        int prime = n;
        boolean found = false;
        while(!found){
            prime++;
            if(isPrime(prime)){
                found =true;
            }

        }
        return prime;
    }
}
