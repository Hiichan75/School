import java.util.Scanner;

public class w2oef2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef de eerste nummer");

        int num1 = sc.nextInt();

        System.out.println("geef de tweede nummer");

        int num2 = sc.nextInt();

        System.out.println("geef de derde nummer");

        int num3 = sc.nextInt();

        int grootste = zoekgrootste(num1, num2, num3);

        System.out.println("grooste nummer is " + grootste);
    }




        public static int zoekgrootste(int a, int b, int c){

            int grootste = a;

            if(b>grootste){
                grootste = b;
            }
            if(c>grootste){
                grootste = c;
            }

            return grootste;
        }

}
