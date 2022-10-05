import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
static Scanner input = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("SSSSSSSSSSSSSSSSSS  BBBBBBBBBBBBBB");
        System.out.println("SSSSSSSSSSSSSSSSSS  BBB         BBB");
        System.out.println("SSSSSSSS            BBB          BBB");
        System.out.println("SSSSSSSS            BBB          BBB");
        System.out.println("SSSSSSSSSSSSSSSSSS  BBBBBBBBBBBBB    ");
        System.out.println("SSSSSSSSSSSSSSSSSS  BBBBBBBBBBBBB    ");
        System.out.println("         SSSSSSSSS  BBB          BBB");
        System.out.println("         SSSSSSSSS  BBB          BBB");
        System.out.println("SSSSSSSSSSSSSSSSSS  BBB         BBB ");
        System.out.println("SSSSSSSSSSSSSSSSSS  BBBBBBBBBBBBBB  ");

        System.out.println("Please enter a a number in Farenheit");
        double degreesCelsius;
        double degreesFarenheit;
        degreesFarenheit = input.nextInt();
        degreesCelsius = (degreesFarenheit-32) * 5/9;

        System.out.println("Please enter a 5 character string");
        String originalWord = input.next();
        String cutWord = originalWord.substring(1,4);
        cutWord = new StringBuilder(cutWord).reverse().toString();

        Random randomInit = new Random();
        int randomNumber = randomInit.nextInt(31,16383);
        System.out.println("Random number Generating...");
        System.out.println("Your new string is " + degreesCelsius + cutWord + randomNumber);




    }
}
