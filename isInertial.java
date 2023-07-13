package Challenges;
import java.util.Arrays;


public class isInertial {

    public static void main(String[] args){
        System.out.println(isInertial(new int[]{1,1,1,1,1,1,2}));

    }
    static String isInertial(int[] a){
        int isInertial = 1;
        int hasAtleastOneOdd = 0;
        int maxNumberIsEven = 0;
        int maxNumber = a[0];
        int lengthOdd = 0;
        int lengthEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
                hasAtleastOneOdd = 1;
                lengthOdd++;
            } else lengthEven++;
        }
        if (hasAtleastOneOdd == 0) return 0 + " no odd value";

        for (int i = 0; i < a.length; i++) {
                    if (a[i] > maxNumber) maxNumber = a[i];

        }
        System.out.println("max " + maxNumber);
        if (maxNumber % 2 == 0 || maxNumber % 2 == -0) {
            maxNumberIsEven = 1;
        }
        if (maxNumberIsEven == 0) return 0 + " max number is not even, " + maxNumber + " is the max number";

        int[] oddValues = new int[lengthOdd];
        int[] evenValues = new int[lengthEven];
        int oddIdx = 0;
        int evenIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 2 == -0) {
                evenValues[evenIdx] = a[i];
                evenIdx++;
            } else {
                oddValues[oddIdx] = a[i];
                oddIdx++;
            }
        }

        for (int i = 0; i < oddValues.length; i++) {
            for (int j = 0; j < evenValues.length; j++) {
                if (evenValues[j] != maxNumber) {
                    if (oddValues[i] < evenValues[j]) {
                        isInertial = 0;
                        return isInertial + " some odd value is not greater than some even value which is not the Max number";
                    }
                }
            }
        }
        return isInertial + " is Intertial";
    }

//    public static int isInertial(int[]a){
////        it contains at least one odd value; => Arrays.asList(a).contains(odd);
////        the max value in a is even;    Collections.max(Arrays.asList(a));
////        every odd is greater than every even value but max;
//        int isInertial = 1;
//        int lengthOdd = 0;
//        int lengthEven = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
//                lengthOdd++;
//            } else lengthEven++;
//        }
//        int [] odd = new int[lengthOdd];
//        int [] even = new int[lengthEven];
//        int evenIndex = 0;
//        int oddIndex =0;
//
//        int max = Arrays.stream(a).max().getAsInt();
//        for(int i= 0; i < a.length; i++){
//                if(isEven(i)){
//                    even[evenIndex] = a[i];
//                    evenIndex++;
//                }
//                else{
//                    odd[oddIndex] = a[i];
//                    oddIndex++;
//                }
//        }
//        System.out.println("length" + " " + even.length);
//        if(odd[0] == 0 || !isEveryItemInArray1GreaterThanArray2( odd, even) || !isOdd(max) ){ isInertial =0;}
//        return isInertial;
//
//    }
//    public static boolean isEven(int n){
//        boolean isEven = false;
//        if(n %2 == 0){
//            return !isEven;
//        }
//        return isEven;
//    }
//    public static boolean isOdd(int n){
//        boolean isOdd = true;
//        if(n %2 == 0){
//            return !isOdd;
//        }
//        return isOdd;
//    }
//    public static boolean isEveryItemInArray1GreaterThanArray2(int[] array1, int[] array2) {
//        int max = Arrays.stream(array2).max().getAsInt();
//        System.out.println(max);
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if(array1[i]!= max){
//                    if (array1[i] >= array2[j]) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }

}
