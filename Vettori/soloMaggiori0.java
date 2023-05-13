package Vettori;
import java.util.Scanner;
public class soloMaggiori0 {
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
            System.out.println("Inserisci i valori nel vettore: ");
            vettore[i] = input.nextInt();
        }

        input.close();
        int dim = 0;

        for(int j = 0; j < vettore.length; j++)
        {
            if(vettore[j] >= 0)
                dim++;
        }

        int [] vettoreInverso = new int [dim];
        int indiceSecondoVettore = 0;
        for( int n = vettore.length -1; n >= 0; n--)
        {
            if(vettore[n] >= 0 )
            {
                vettoreInverso[indiceSecondoVettore] = vettore[n];
                indiceSecondoVettore++;
            }
        }

        System.out.println("Array originale: ");
        for(int i = 0; i < dimensione; i++)
        {
            System.out.printf("%-5d", vettore[i]);
        }

        System.out.println();
        System.out.println("Array inverso: ");
        for(int i = 0; i < dim; i++)
        {
            System.out.printf("%-5d", vettoreInverso[i]);
        }
    }
}
