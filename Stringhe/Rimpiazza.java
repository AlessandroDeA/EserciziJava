package Stringhe;
import java.util.Scanner;
public class Rimpiazza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");
        String frase = input.nextLine();
        System.out.println("Carattere da rimpiazzare?");
        String charRimpiazzare = input.nextLine();
        System.out.println("Carattere con cui sostituirlo:");
        String charSostitutivo = input.nextLine();

        input.close();

        if(frase.contains(charRimpiazzare))
            frase = frase.replace(charRimpiazzare, charSostitutivo);
        System.out.println(frase);
    }
}
