public class arrayE2Extra {

    static void tweeArrayVergelijken(int[] a, int[] b) {

        boolean gelijk = true;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {

                if (a[i] != b[i]) {
                    gelijk = false;
                }
            }

        } else {
            gelijk = false;
        }
        if (gelijk == false) {
            System.out.println("beide arrays zijn niet gelijk");
        } else {
            System.out.println("beide arrays zijn wel gelijk");
        }


    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {1, 2, 3, 4, 6};
        System.out.println("vergelijking array 1 en 2");
        tweeArrayVergelijken(a,b);
        System.out.println("vergelijking array 1 en 3");
        tweeArrayVergelijken(a,c);

    }
}
