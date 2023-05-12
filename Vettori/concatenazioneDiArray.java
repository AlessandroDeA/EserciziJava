package Vettori;
import java.util.Scanner;

public class concatenazioneDiArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int l1 = 0;
        int l2 = 0;
        int posizione = 0;

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

        int vet1[] = new int[l1];

        do
        {
            System.out.println("Inserisci la lunghezza del vettore (deve essere un numero positivo): ");
            while (!input.hasNextInt())
            {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            l2 = input.nextInt();
        } while (l2 <= 0);

        int vet2[] = new int [l2];

        int l3 = vet1.length + vet2.length;
        int conct[] = new int[l3];

        System.out.println("Inserisci i dati per il primo vettore: ");
        for(int i = 0; i < vet1.length; i++)
        {
            vet1[i] = input.nextInt();
            conct[posizione] = vet1[i];
            posizione++;
        }
        System.out.println("Inserisci i dati per il secondo vettore");
        for(int y = 0; y < vet2.length; y++)
        {
            vet2[y] = input.nextInt();
            conct[posizione] = vet2[y];
            posizione++;
        }
        
        System.out.println("Questa è la concatenazione dei due gruppi di numeri che hai inserito:");
        for(int i = 0; i < conct.length; i++)
        {
            System.out.print(conct[i]+ " ");
        }
        input.close();
    }
}