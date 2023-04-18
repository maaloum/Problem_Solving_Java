package Challenges;


public class subSequence {

    public static void main(String[] args){
        char[] resultat = subSequence(new char [] {'a', 'b', 'c'}, 0, 3);
        System.out.println(resultat);
    }

    public static char[] subSequence( char [] a, int start, int length){
        char [] b = new char[length];
        if(start<0 || length<0 || start + length -1>= a.length) return null;

        for (int i = start, j =0; i < length; i++, j++){
            b[j] = a[i];
        }
        return b;

    }
}
