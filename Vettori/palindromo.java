package Vettori;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        int vettore[] = new int[10];
        boolean palindromo = true;
        Scanner print = new Scanner(System.in);
        System.out.println("Inserisci 10 numeri: ");

        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = print.nextInt();
        }

        for (int a = 0, b = vettore.length - 1; a < b; a++, b--) {
            if (vettore[a] != vettore[b]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("Il vettore è un palindromo.");
        } else {
            System.out.println("Il vettore non è un palindromo.");
        }
        print.close();
    }
}