package Stringhe;
import java.util.Scanner;
public class SoloVocali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String str = input.nextLine();
        input.close();
        String ing = "";
        char ch;
        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                ing += ch;
            }
        }

        System.out.println("Queste sono le vocali all'interno della stringa che mi hai dato: " + ing);
    }
}
