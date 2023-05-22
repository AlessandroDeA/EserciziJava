package Stringhe;
import java.util.Scanner;
public class ParoleQuasiUguali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire una parola:");
        String parola1 = input.nextLine();
        System.out.println("Inserisci un' altra parola:");
        String parola2 = input.nextLine();

        input.close();

        if(parola1.equals(parola2))
            System.out.println("Sono uguali!");
        else if(parola1.equalsIgnoreCase(parola2))
            System.out.println("Sono quasi uguali!");
        else if(!parola1.equals(parola2))
            System.out.println("Non sono uguali!");
    }
}
