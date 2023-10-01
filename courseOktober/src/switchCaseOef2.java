import java.util.Scanner;

public class switchCaseOef2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een filmgenre");

        String filmGenre = scanner.next();


        switch(filmGenre){


            case"actie":
                System.out.println("De actiefilm is een filmgenre waarbij actiescènes van groot belang zijn.");
                System.out.println("Mijn favoriete film daarvan is: James Bond-film The World Is Not Enough");
                break;

            case"romantiek":
                System.out.println("Een romantische film is een filmgenre waarin de liefde tussen twee personages centraal staat.");
                System.out.println("Mijn favoriete film daarvan is:");
                break;

            case"horror":
                System.out.println("Horror is een genre van verhalen waarbij het de bedoeling is de lezer of de toeschouwer als vorm van amusement angst aan te jagen.");
                System.out.println("Mijn favoriete film daarvan is:");
                break;

            default:
                System.out.println("foutive invoer");


        }
    }
}

