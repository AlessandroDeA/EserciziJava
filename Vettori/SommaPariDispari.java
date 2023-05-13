package Vettori;

public class SommaPariDispari {
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        int sommaPari = 0;
        int sommaDispari = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(i%2==0)
            sommaPari += array[i];
            else
                sommaDispari += array[i];
        }

        if(sommaPari == sommaDispari)
            System.out.println("Pari e dispari uguali: " + "Somma Pari "+sommaPari+" Somma Dispari "+sommaDispari);
        else
            System.out.println("Pari e dispari non sono uguali: " + "Somma Pari "+sommaPari+" Somma Dispari "+sommaDispari);
    }
}
