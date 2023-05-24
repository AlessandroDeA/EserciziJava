package Stringhe;
import java.util.Scanner;
import java.lang.StringBuilder;
public class ReverseWordStringBuilder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");
        String str = input.nextLine();
        StringBuilder reversed = new StringBuilder(str).reverse();
        String output = reversed.toString();

        input.close();
        System.out.println("Questa è la tua frase al contrario: "+ output);
    }
}
