import java.util.Scanner;

public class w2oef1punt1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;

        System.out.println("geef een getal");

        input = sc.nextInt();

        if(input >= 0){
            System.out.println("deze getal is positief");

        }else{
            System.out.println("deze getal is negatief");
        }
    }
}
