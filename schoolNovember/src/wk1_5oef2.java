public class wk1_5oef2 {

    public static void main(String[] args) {

        System.out.println("even getallen");
        for (int i = 0; i < 50; i++) {

            double rand = Math.random();
            double random = rand * 21;

            int uitkomst = (int) random;

            if (uitkomst != 0 && uitkomst % 2 == 0) {

                System.out.print(uitkomst + " ");

            }


        }
        System.out.println("oneven getallen");

        for (int i = 0; i < 50; i++) {

            double rand = Math.random();
            double random = rand * 21;

            int uitkomst = (int) random;

            if (uitkomst % 2 != 0) {

                System.out.print(uitkomst + " ");
            }
        }
    }
}