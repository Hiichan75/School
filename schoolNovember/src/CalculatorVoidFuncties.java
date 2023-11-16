import java.util.Scanner;

public class CalculatorVoidFuncties {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kies een berekening die je wilt uitvoeren (+, *, -, /). ! om te stoppen: ");
            String operator = scanner.next();

            if (operator.equals("!")) {
                System.out.println("Programma gestopt.");
                break;
            }

            System.out.println("Geef het eerste getal in: ");
            double num1 = scanner.nextDouble();

            System.out.println("Geef het tweede getal in: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case "+":
                    double sum = optellen(num1, num2);
                    System.out.println("De uitkomst is " + sum + ".");
                    break;
                case "-":
                    aftrekken(num1, num2);
                    break;
                case "/":
                    double resultaat = delen(num1, num2);
                    if (resultaat != Double.MIN_VALUE) {
                        System.out.println("De uitkomst is " + resultaat + ".");
                    }
                    break;
                case "*":
                    double product = maal(num1, num2);
                    System.out.println("De uitkomst is " + product + ".");
                    break;
                default:
                    System.out.println("Ongeldige operator. Probeer opnieuw.");
                    continue; // Ga terug naar de bovenkant van de lus om een nieuwe operator te vragen.
            }
        }
    }

    public static double optellen(double a, double b) {
        return a + b;
    }

    public static void aftrekken(double a, double b) {
        double verschil = a - b;
        System.out.println("De uitkomst is " + verschil + ".");
    }

    public static double delen(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Je kan niet delen door nul.");
            return Double.MIN_VALUE; // Geeft een speciale waarde terug om aan te geven dat er een fout was
        }
    }

    public static double maal(double a, double b) {
        // Je mag zelf kiezen hoe je maal implementeert.
        return a * b;
    }
}
