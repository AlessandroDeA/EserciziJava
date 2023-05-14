package Vettori;
import java.util.Scanner;
public class MediaMultipliDi3 {
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

        for(int i = 0; i < vettore.length; i++)
        {
            System.out.println("Inserisci i valori all'interno del vettore: ");
            vettore[i] = input.nextInt();
        }

        input.close();

        int contMedia = 0;
        int sumUp = 0;
        int media = 0;
        for(int j = 0; j < vettore.length; j++)
        {
            if(vettore[j]%3==0)
            {
                sumUp += vettore[j];
                contMedia++;
            }
        }

        media = sumUp/contMedia;

        System.out.println("La media dei multipli di 3 presenti all' interno del vettore è: "+media);

    }

}
