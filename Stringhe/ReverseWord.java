package Stringhe;
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci una parola:");
        String parola1 = input.nextLine();
        String parolaReverse = "";
        System.out.println("Questa è la tua parola:" +parola1);
        char ch;
        input.close();
        for(int i = 0; i<parola1.length(); i++)
        {
            ch = parola1.charAt(i);
            parolaReverse = ch+parolaReverse;
        }
        System.out.println("Parola al contrario: "+ parolaReverse);
    }
}
