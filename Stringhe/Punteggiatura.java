package Stringhe;
import java.util.Scanner;
public class Punteggiatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int cont = 0;

        while(true)
        {
            System.out.println("Inserisci una parola contenente punteggiatura:");
            str = input.nextLine();
            if(str.isEmpty())
                break;
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == '.' || ch == ',' || ch == ';' || ch == ':' || ch == '!' || ch == '?') {
                        cont++;
                    }
                }
            }
            input.close();
            System.out.println("Numero di punteggiature trovate: " + cont);
        }
}
