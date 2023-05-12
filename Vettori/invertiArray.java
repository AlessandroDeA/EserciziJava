package Vettori;
import java.util.Scanner;
public class invertiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimensione;
        do
        {
            System.out.println("Inserisci la lunghezza del vettore (deve essere un numero positivo): ");
            while (!input.hasNextInt())
            {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            dimensione = input.nextInt();
        } while (dimensione <= 0);

        int[] vettore = new int [dimensione];
        int[] vettoreInverso = new int [dimensione];
        
        for(int i = 0; i < vettore.length; i++)
        {
            System.out.println("Inserisci i valori dell'array: ");
            vettore[i] = input.nextInt();
        }
    
        input.close();

        for(int i = 0; i < vettoreInverso.length; i++)
        {
            vettoreInverso[i] = vettore[dimensione - 1 - i];
        }
        
        System.out.println("Array originale: ");
        for(int i = 0; i < dimensione; i++)
        {
            System.out.printf("%-5d", vettore[i]);
        }

        System.out.println();
        System.out.println("Array inverso: ");
        for(int i = 0; i < dimensione; i++)
        {
            System.out.printf("%-5d", vettoreInverso[i]);
        }
    }
}
