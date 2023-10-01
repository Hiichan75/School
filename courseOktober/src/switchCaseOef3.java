import java.util.Scanner;

public class switchCaseOef3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ticket = 12;

        System.out.println("Ben je een student?");

        String student = scanner.next();

        switch (student) {

            case "ja":
                System.out.println("uw ticket kost " + (ticket * 0.7));
                break;

            case "nee":
                System.out.println("Geef uw leeftijd");

                int leeftijd = scanner.nextInt();

                if (leeftijd >= 65) {
                    System.out.println("uw ticket kost " + (ticket * 0.8));
                } else {
                    if (leeftijd < 65 && leeftijd >= 0) {
                        System.out.println("uw ticket kost " + ticket);

                    } else if (leeftijd < 0) {
                        System.out.println("foutive invoer");
                        break;
                    }



                }
            default:
                System.out.println("foutive invoer");
        }
    }
}

            


