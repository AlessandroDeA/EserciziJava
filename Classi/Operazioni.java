package Classi;

import java.text.DecimalFormat;

public class Operazioni {
    public double num1;
    public double num2;

    public Operazioni(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addizione() {
        double risultato = num1 + num2;
        System.out.println("Il risultato dell'addizione tra i due numeri inseriti è: " + risultato);
    }

    public void sottrazione() {
        double risultato = num1 - num2;
        System.out.println("Il risultato della sottrazione tra i due numeri inseriti è: " + risultato);
    }

    public void moltiplicazione() {
        double risultato = num1 * num2;
        System.out.println("Il risultato della moltiplicazione tra i due numeri inseriti è: " + risultato);
    }

    public void divisione() {
        if (num2 != 0) {
            double risultato = num1 / num2;
            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formatta il risultato con 2 decimali
            System.out.println("Il risultato della divisione tra i due numeri inseriti è: " + decimalFormat.format(risultato));
        } else {
            System.out.println("Impossibile dividere per zero.");
        }
    }
}

