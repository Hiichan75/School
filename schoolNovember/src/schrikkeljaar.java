import java.util.Scanner;

public class schrikkeljaar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef een jaartal");

        int jaartal = sc.nextInt();

        if(jaartal % 400 == 0 || (jaartal % 100 != 0 && jaartal % 4 == 0)){
            System.out.println(jaartal + " is een schrikkeljaar");
        }else{
            System.out.println(jaartal + " is geen schrikkeljaar");
        }
    }
}
