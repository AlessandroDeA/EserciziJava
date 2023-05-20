package Stringhe;
import java.util.Scanner;
public class ParoleUguali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire una parola");
        String parola1 = input.nextLine();
        System.out.println("Inserire una parola:");
        String parola2 = input.nextLine();
        input.close();
        
        if(parola1.equals(parola2))
            System.out.println("Le paorle sono uguali!");
        else
        System.out.println("Le parole non sono uguali!");
    }
}
