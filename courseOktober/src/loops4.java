import java.util.Scanner;

public class loops4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef een tekst in: ");
        String tekst = sc.nextLine();

        int klinkers = 0;
        int i = 0;

        for(i = 0;  i < tekst.length(); i++){
            if(tekst.charAt(i) == 'a' || tekst.charAt(i) == 'A' || tekst.charAt(i) == 'e' ||
                    tekst.charAt(i) == 'E' || tekst.charAt(i) == 'i' || tekst.charAt(i) == 'I' ||
                    tekst.charAt(i) == 'o' || tekst.charAt(i) == 'O' || tekst.charAt(i) == 'u' ||
                    tekst.charAt(i) == 'U' || tekst.charAt(i) == 'y' || tekst.charAt(i) == 'Y'){

                klinkers++;
            }
        }

        System.out.println("Het aantal klinkers is: " + klinkers);
    }
}
