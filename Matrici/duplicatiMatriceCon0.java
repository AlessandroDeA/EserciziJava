package Matrici;
import java.util.Scanner;

public class duplicatiMatriceCon0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di righe della matrice: ");
        int righe = input.nextInt();
        System.out.print("Inserisci il numero di colonne della matrice: ");
        int colonne = input.nextInt();

        int[][] primaMatrice = new int[righe][colonne];
        int[][] secondaMatrice = new int[righe][colonne];

        // Popolazione della prima matrice con valori inseriti dall'utente
        System.out.println("Inserisci i valori per la prima matrice:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print("Inserisci il valore per la posizione [" + i + "][" + j + "]: ");
                primaMatrice[i][j] = input.nextInt();
            }
        }

        // Creazione della seconda matrice con gli stessi dati della prima, sostituendo i duplicati con 0
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                int valore = primaMatrice[i][j];
                boolean duplicato = false;

                // Verifica se il valore è duplicato in tutta la matrice
                for (int k = 0; k < righe; k++) {
                    for (int l = 0; l < colonne; l++) {
                        if ((k != i || l != j) && primaMatrice[k][l] == valore) {
                            duplicato = true;
                            break;
                        }
                    }
                    if (duplicato) {
                        break;
                    }
                }

                // Sostituzione del valore duplicato con 0 nella seconda matrice
                if (duplicato) {
                    secondaMatrice[i][j] = 0;
                } else {
                    secondaMatrice[i][j] = valore;
                }
            }
        }

        // Stampa della prima matrice
        System.out.println("Prima Matrice:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(primaMatrice[i][j] + " ");
            }
            System.out.println();
        }

        // Stampa della seconda matrice
        System.out.println("Seconda Matrice:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(secondaMatrice[i][j] + " ");
            }
            System.out.println();
            input.close();
        }
    }
}