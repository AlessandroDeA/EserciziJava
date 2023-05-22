package Stringhe;
import java.util.Scanner;
public class Lunghezze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str;
        int cont = 0;
        while(true)
        {
            System.out.println("Inserisci una parola: ");
            str = input.nextLine();
            if(str.isEmpty())
            {
                break;
            }
            if(Character.isUpperCase(str.charAt(0)))
            {
                cont += str.length();
            }
        }
        input.close();
        System.out.println(cont);
    }
}
