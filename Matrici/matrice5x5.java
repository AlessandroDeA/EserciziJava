package Matrici;
import java.util.Scanner;
public class matrice5x5 {
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

        input.close();

        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                if(i == j)
                    matrice[i][j] = 1;
                else
                    matrice[i][j] = 0;
            }
        }

        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                System.out.printf("%-5d",matrice[i][j]);
            }
          System.out.println();
        }
    }
}
