package Classi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il primo numero: ");
        double n1 = input.nextDouble();
        System.out.println("Inserisci il secondo numero: ");
        double n2 = input.nextDouble();
        

        Operazioni calcoli = new Operazioni(n1, n2);
        
        calcoli.addizione();
        calcoli.sottrazione();
        calcoli.moltiplicazione();
        calcoli.divisione();
        
        System.out.println();
        System.out.println("Inserisci la base per il calcolo della potenza: ");
        int base = input.nextInt();
        Potenza calcoloPotenza = new Potenza(base);
        calcoloPotenza.pow();
        calcoloPotenza.cambiaBase();
        input.close();
    }
}
