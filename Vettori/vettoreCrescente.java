package Vettori;
import java.util.FormattableFlags;
import java.util.Scanner;
public class vettoreCrescente {
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

        int [] vettore = new int [dimensione];

        for(int i = 0; i < vettore.length; i++)
        {
            System.out.println("Inserisci i valori all'interno del vettore: ");
            vettore[i] = input.nextInt();
        }

        input.close();
        boolean isCrescente = true;
       
        for(int i = 0; i < vettore.length-1; i++)
        {
            if(vettore[i+1] < vettore[i]){
                isCrescente = false;
                break;
            }
        }

        if(isCrescente)
        {
            System.out.println("Il vettore è di tipo crescente: ");
            for(int i = 0; i < vettore.length; i++)
            {
                System.out.printf("%-5d", vettore[i]);
            }
        }

        else
        {
            System.out.println("Il vettore non è di tipo crescente: " );
            for(int i = 0; i <  vettore.length; i++)
            {
                System.out.printf("%-5d", vettore[i]);
            }
        }
    }
}
