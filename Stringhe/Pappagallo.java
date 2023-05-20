package Stringhe;
import java.util.Scanner;
public class Pappagallo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String frase = "1";
        System.out.println("Scrivi qualcosa");

        while(!frase.isBlank())
        {
            frase = input.nextLine();
            System.out.println(frase);
        }
        input.close();
    }
}
