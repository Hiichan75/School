import java.util.Scanner;

public class loops4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("geef ons een tekst");
        String tekst = sc.nextLine();
        String klinkers = "aeiouyAEIOUY";
        char kar;
        int pos, aantal=0;

        for(int i = 0; i < tekst.length(); i++){

            kar = tekst.charAt(i);
            pos = klinkers.indexOf(kar);
            if(pos >= 0){
                aantal++;
            }

        }

        System.out.println(aantal);
    }
}
