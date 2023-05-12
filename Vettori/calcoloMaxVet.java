package Vettori;
import java.util.Scanner;

public class calcoloMaxVet {
    public static void main(String[] args) {
        int vettore[] = new int[10];
        int max = 0;
        Scanner print = new Scanner(System.in);

        System.out.println("Inserisci 10 numeri: ");

        for (int c = 0; c < vettore.length; c++) {
            vettore[c] = print.nextInt();
            if (vettore[c] > max) {
                max = vettore[c];
            }
        }
        print.close();
        System.out.println("Il numero più grande che hai inserito è: " + max);
    }
}