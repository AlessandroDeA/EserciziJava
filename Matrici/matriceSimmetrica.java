package Matrici;
import java.util.Scanner;
public class matriceSimmetrica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isSimmetrica = true;
        int row;
        int column;

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

        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < matrice.length; i++)
        {
            for(int j = 0; j < matrice[i].length; j++)
            {
                if(matrice[i][j] != matrice[j][i])
                {
                    isSimmetrica = false;
                    break;
                }
            }
            if(!isSimmetrica)
                break;
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

        if(isSimmetrica)
            System.out.println("La matrice inserita è simmetrica.");
        else
        System.out.println("La matrice non è simmetrica.");
    }
}
