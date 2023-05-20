package Stringhe;
import java.util.Scanner;
public class SpezzaMeta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire una stringa :");
        String frase = input.nextLine();
        System.out.println();
        System.out.println(frase);
        input.close();

        int lunghezzaStr = frase.length();
        int metaLung = lunghezzaStr/2;

        String primaMeta = frase.substring(0, metaLung);
        String secondaMeta = frase.substring(metaLung);

        System.out.println("Prima metà: " + primaMeta);
        System.out.println("Seconda metà: " + secondaMeta);

    }
}
