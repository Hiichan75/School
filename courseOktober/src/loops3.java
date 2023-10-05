import java.util.Scanner;

public class loops3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Geef een jaar");

        int jaartal = sc.nextInt();

        if(jaartal % 400 == 0 || (jaartal % 100 != 0 && jaartal % 4 == 0)){

            System.out.println("Dit is een schrikkeljaar");

        }else{
            System.out.println("Dit is geen schrikkeljaar");
        }
  }
}
