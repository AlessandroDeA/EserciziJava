package Matrici;
import java.util.Scanner;
public class maxPositionMatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;
        int vMax = 0;
        do {
            System.out.println("Inserisci quante righe vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            row = input.nextInt();
        } while (row <= 0);
    
        do {
            System.out.println("Inserisci quante colonne vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.next();
            }
            column = input.nextInt();
        } while (column <= 0);
    
        int[][] matrice = new int[row][column];
        int rowMax = 0;
        int columnMax = 0;
        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
                if(matrice[i][j] > vMax)
                {
                    vMax = matrice[i][j];
                    rowMax = i;
                    columnMax = j;
                }
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
        System.out.println("Il valore più grande che hai inserito nella matrice si trova nella posizione:"+"["+(rowMax+1)+"]"+"["+(columnMax+1)+"]");
        input.close();
    }
}
