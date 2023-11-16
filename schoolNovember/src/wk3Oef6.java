import java.util.Scanner;

public class wk3Oef6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nieuweSaldo = 0;

        do {


            System.out.println("geef mij een saldo");

            int saldoInput = sc.nextInt();

            nieuweSaldo = nieuweSaldo + saldoInput;

            System.out.println("nieuwe saldo = " + nieuweSaldo);


        } while (nieuweSaldo > 0 && nieuweSaldo < 1000000);


        if (nieuweSaldo < 0) {
            System.out.println("banksaldo negatief");
        } else if (nieuweSaldo > 1000000)
            System.out.println("banksaldo is over 1 miljoen"); }
    }


