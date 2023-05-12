package Vettori;
import java.util.Scanner;
public class piuFrequente{
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

        int elementoFrequente = 0;
        int frequenzaMassima = 0;

        for(int i = 0; i < vettore.length; i++)
        {
            int elementoCorrente = vettore[i];
            int frequenzaCorrente = 1;

            for(int j = i + 1; j < vettore.length; j++)
            {
                if(vettore[j] == elementoCorrente)
                {
                    frequenzaCorrente++;
                }

                if(frequenzaCorrente > frequenzaMassima)
                {
                    elementoFrequente = elementoCorrente;
                    frequenzaMassima = frequenzaCorrente;
                }
            }
        }

        System.out.println("L'elemento più frequente è: " + elementoFrequente);
    }
}