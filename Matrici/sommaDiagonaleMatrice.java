package Matrici;
import java.util.Scanner;
public class sommaDiagonaleMatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimensione;

        do {
            System.out.println("Inserisci la dimensione della matrice quadrata (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            dimensione = input.nextInt();
        } while (dimensione <= 0);
        int [][] matrice = new int [dimensione][dimensione];

        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
            }
        }

        int somma = 0;
        for(int i = 0; i < dimensione; i++)
        {
            somma += matrice[i][i];
        }

        System.out.println("La matrice inserita è: ");
        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.printf("%-5d",matrice[i][j]);
            }
          System.out.println();
        }

        System.out.println("Il valore massimo nella diagonale principale è: "+ somma);
        input.close();
    }
}
