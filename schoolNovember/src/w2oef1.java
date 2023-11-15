import java.util.Scanner;

public class w2oef1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;

        System.out.println("geef een getal");

        input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("deze getal is even");

        }else{
            System.out.println("deze getal is oneven");
        }
    }
}
