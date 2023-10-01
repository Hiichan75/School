import java.util.Scanner;

public class Oefening4 {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("Give the first number");
        int firstNumber = scanny.nextInt();

        System.out.println("Give the second number");
        int secondNumber = scanny.nextInt();

        System.out.println("Expected output is:" + (firstNumber * secondNumber));
    }
}
