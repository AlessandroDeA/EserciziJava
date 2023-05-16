package Matrici;
import java.util.Scanner;
import java.util.Random;

public class matriceRandom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
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

        int cont = 0;
        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                int numeroCasuale = random.nextInt(10);
                matrice[i][j] = numeroCasuale;

                if(matrice[i][j] == 0)
                    cont++;
            }
        }

        System.out.println("La tua matrice è: ");
        for(int i = 0; i < dimensione; i++)
        {
            for(int j = 0; j < dimensione; j++)
            {
                System.out.printf("%-5d",matrice[i][j]);
            }
            System.out.println();
        }

        System.out.println("Ci sono un totale di "+cont+" zeri");
    }

}
