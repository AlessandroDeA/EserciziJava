package Matrici;
import java.util.Scanner;
public class sommaPalindromoMatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimensione;

        do {
            System.out.println("Inserisci quante righe vuoi (deve essere un numero positivo): ");
            while (!input.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero positivo.");
                input.nextLine();
            }
            dimensione = input.nextInt();
        } while (dimensione <= 0);

        int[][] matrice = new int [dimensione][dimensione];
        int []  vetSomme = new int [dimensione];
        boolean isPalindromo = true;

        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = input.nextInt();
                vetSomme[j] += matrice[i][j];
            }
        }
        input.close();
        for(int a = 0, b = vetSomme.length -1; a < b; a++, b--)
        {
            if(vetSomme[a]!=vetSomme[b])
                isPalindromo = false;
                break;
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

        if(isPalindromo)
            System.out.println("Le somme delle righe della matrice sono un palindromo.");
        else
            System.out.println("Le somme delle righe della matrice non sono un palindromo.");
    }
}
