package Challenges;

public class PerfectSquare {

    public  static void main(String [] args){

        System.out.println(perfectSquare(6));
        System.out.println(perfectSquare(36));
        System.out.println(perfectSquare(0));
        System.out.println(perfectSquare(-5));

    }


    public static int perfectSquare(int n ){
        int nextSquare = (int) (Math.floor(Math.sqrt(n)) + 1);
        return nextSquare* nextSquare;
    }
}
