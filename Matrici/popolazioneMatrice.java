package Matrici;
import java.util.Scanner;

public class popolazioneMatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1 = 0;
        int l2 = 0;

        do {
            System.out.println("Inserisci quante righe vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            l1 = input.nextInt();
        } while (l1 <= 0);

        do {
            System.out.println("Inserisci quante colonne vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            l2 = input.nextInt();
        } while (l2 <= 0);

        int[][] matrice = new int[l1][l2];

        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
            }
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
        input.close();
    }
}