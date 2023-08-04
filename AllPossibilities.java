import java.util.ArrayList;

public class AllPossibilities{


    public static void main(String[] args) {

        System.out.println(isAllPosiblities(new int[] {1, 2, 0, 3}));
        System.out.println(isAllPosiblities(new int[] {3, 2, 1, 0}));
        System.out.println(isAllPosiblities(new int[] {1, 2, 4, 3}));
        System.out.println(isAllPosiblities(new int[] {0, 2, 3}));
        System.out.println(isAllPosiblities(new int[] {0}));
        System.out.println(isAllPosiblities(new int[] {1}));
        System.out.println(isAllPosiblities(new int[] {}));
        System.out.println(isAllPosiblities(null));
        
    }


    public static int isAllPosiblities(int[] a){
        if(a == null || a.length == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            list.add(a[i]);
        }
        for(int i = 0; i < a.length; i++){
            if(!list.contains(i)) return 0;
        }
        // for(int i = 0; i < a.length; i++){

        //     boolean found = false;
        //     for(int j = 0; j < a.length; j++){
        //         if(a[j] == i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found) return 0;
        // }



        return 1;
    }

}