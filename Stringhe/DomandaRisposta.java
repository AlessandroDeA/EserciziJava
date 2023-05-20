package Stringhe;
import java.util.Scanner;
public class DomandaRisposta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci una frase: ");
        String frase = input.nextLine();
        input.close();
        
        if(frase.contains("?")&& !frase.contains("!"))
            System.out.println("Non saprei...");

        if(frase.contains("!") && !frase.contains("?"))
            System.out.println("Hai proprio ragione!");

        if(!frase.contains("?") && !frase.contains("!"))
            System.out.println("Mmm, non mi convince...");
    }
}
