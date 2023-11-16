import java.util.Scanner;

public class calculatorVoidFunctie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("kies een bewerking (+,-,/,*) ! om te stoppen: ");
        String operator = sc.next();
        boolean stoppen = false;



        while (!stoppen) {

            if(operator.equals("!")){
                System.out.println("programma is nu gestopt");
                stoppen = true;
                continue;

            }

            System.out.println("geef getal 1 in");

            int getal1 = sc.nextInt();

            System.out.println("geef getal 2 in");

            int getal2 = sc.nextInt();


            switch (operator) {
                case "+":
                    System.out.println("de uitkomst is " + optellen(getal1, getal2));
                    break;
                case "-":
                    aftrekken(getal1, getal2);

                    break;
                case "/":

                    break;
                case "*":

                    break;

                default:
                    System.out.println("ongedige operator, probeer opnieuw");

                    continue;
            }

        }


    }

    public static int optellen(int getal1, int getal2) {
        int optellenUitkomst = getal1 + getal2;
        return optellenUitkomst;
    }
    public static void aftrekken(int getal1, int getal2){ int aftrekkenUitkomst = getal1 - getal2;
        System.out.println("De uitkomst is " + aftrekkenUitkomst);}

}

