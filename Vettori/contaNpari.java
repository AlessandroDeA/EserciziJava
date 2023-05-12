package Vettori;
import java.util.Scanner;

public class contaNpari {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int l1 = 0;
        int contatore = 0;

        do
        {
            System.out.println("Inserisci la lunghezza del vettore (deve essere un numero positivo): ");
            while (!input.hasNextInt())
            {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            l1 = input.nextInt();
        } while (l1 <= 0);

        int vet[] = new int [l1];

        System.out.println("Inserisci dei numeri: ");
        for(int i = 0; i < vet.length; i++)
        {
            vet[i] = input.nextInt();
            if(vet[i]%2 == 0)
            {
                contatore++;
            }
        }
        System.out.println("Hai inserito " + contatore + " numeri pari.");
        input.close();
    }
}