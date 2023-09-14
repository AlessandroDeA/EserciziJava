package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ListArray_stringPrint {
public static void main(String[] args) {
    
ArrayList<String> numeri = new ArrayList<String>();
Scanner input = new Scanner(System.in);
String s;
    do
    {
        System.out.println("Scrivi 'esc' per uscire o inserisci altro testo");
        s = input.nextLine();
        numeri.add(s);
    } while(!s.equalsIgnoreCase("esc"));
    for(int i = 0; i< numeri.size(); i++ )
    {
        System.out.println(numeri.get(i));
    }

    input.close();
}
}