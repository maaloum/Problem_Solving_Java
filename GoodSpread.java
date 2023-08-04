public class GoodSpread {
    public static void main(String[] args) {

        System.out.println(goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(goodSpread(new int[] {3, 1, 3, 1, 3, 5, 5, 3}));
        System.out.println(goodSpread(new int[] {1, 1, 1, 1, 1, 1}));
        System.out.println(goodSpread(new int[] {1, 1, 2, 2, 3, 3}));
        System.out.println(goodSpread(new int[] {1, 1, 2, 2, 3, 3, 3}));
    }

    public static int goodSpread(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            count = 0;
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if(count > 3) {
                return 0;
            }
        }
        return 1;
    }
}
