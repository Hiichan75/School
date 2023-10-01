import java.util.Scanner;

import static java.lang.Math.sqrt;

public class wk1_5oef1 {



    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("Give the first number");
        double firstNumber = scanny.nextInt();

        System.out.println("Give the second number");
        double secondNumber = scanny.nextInt();

        double hypotenusa = Math.sqrt(Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2));

        System.out.println("hypotenusa is:" + hypotenusa);
    }
}
