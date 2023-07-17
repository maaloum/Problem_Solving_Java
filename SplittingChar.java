package Challenges;
//Write a function that accepts a character array, a zero-based start position and a length.
// It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array.
// The function should do error checking on the start position and the length and return null if the either value is not legal
public class SplittingChar {

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        System.out.println(f(array, 0, 3));
    }


    public static char[ ] f(char[ ] a, int start, int len){
        char[] res = new char[len];
        int length =a.length;
        System.out.println(length);
//        if (len < 0 || start < 0 || start+len-1>=a.length)
//        {
//            return null;
//        }


        for (int i = start, j =0; j < len ; i++) {
            res[j] = a[i];
        }
        return res;
    }
}
