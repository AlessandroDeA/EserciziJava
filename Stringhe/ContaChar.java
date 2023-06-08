package Stringhe;
import java.util.Scanner;
public class ContaChar {
    public static void main(String[] args) {
        int cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String stringa = input.nextLine();

        System.out.println("Quale carattere vuoi contare per la sua presenza? ");
        char car = input.next().charAt(0);
        input.close();
        for(int i = 0; i < stringa.length(); i++)
        {
            if(stringa.charAt(i) == car)
                cont++;
        }

        System.out.println("Queste sono le volte in cui il carattere che hai inserito è presente nella stringa che hai inserito: " + cont);
        
    }
}
