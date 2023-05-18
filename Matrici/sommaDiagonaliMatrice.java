package Matrici;
import java.util.Scanner;
public class sommaDiagonaliMatrice {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);

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

        int diagPrin = 0;
        int diagNeg = 0;
        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
            }
            diagPrin += matrice[i][i];
            diagNeg += matrice[i][dimensione -1 -i];
        }
            input.close();

            System.out.println("La matrice inserita è: ");
            for(int i = 0; i < matrice.length; i++)
            {
                for(int j = 0; j < matrice[i].length; j++)
                {
                    System.out.printf("%-5d",matrice[i][j]);
                }
              System.out.println();
            }

            System.out.println("La somma della diagonale principale è: "+ diagPrin);
            System.out.println("La somma della seconda diagonale è: "+ diagNeg);
    }
}