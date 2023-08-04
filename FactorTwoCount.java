public class FactorTwoCount {
    


    public static void main(String[] args) {
        
    }

    public static int factorTwoCount(int n){
        if(n < 1) return 0;
        int count = 0;
        while(n % 2 == 0){
            count++;
            n /= 2;
        }
        return count;
    }
}
