package Matrici;
import java.util.Scanner;
public class sommaColonneMatrice {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int row;
        int column;

        do {
            System.out.println("Inserisci quante righe vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.nextLine();
            }
            row = input.nextInt();
        } while (row <= 0);
    
        do {
            System.out.println("Inserisci quante colonne vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.nextLine();
            }
            column = input.nextInt();
        } while (column <= 0);
    
        int[][] matrice = new int[row][column];
        int[] vetSomme = new int [column];

        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
                vetSomme[j] += matrice[i][j];
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

        System.out.println("La somma di ogni colonna è: ");
        for(int i = 0; i < vetSomme.length; i++)
        {
            System.out.printf("%-5d", vetSomme[i]);
        }
        input.close();
    }
    
}
