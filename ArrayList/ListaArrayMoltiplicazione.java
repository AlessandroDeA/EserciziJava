package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArrayMoltiplicazione {
    public static void main(String[] args) {
        
        ArrayList <Double> numeri = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        double sum = 0, numbers;

        System.out.println("Inserisci i numeri (inserisci un valore non numerico per terminare l'inserimento)");

        while(scanner.hasNextDouble())
        {
            numbers = scanner.nextDouble();
            numeri.add(numbers);
        }
        scanner.close();

        for(double x : numeri)
        {
            sum *= x;
        }

        System.out.println("Il prodotto dei numeri nell'ArrayList é: "+ sum);
    }
}
