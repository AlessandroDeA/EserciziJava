package Classi;
import java.util.Scanner;
public class Potenza {
    public int base;

    public Potenza(int base)
    {
        this.base = base;
    }

    public void pow()
    {
        base *= base;
        System.out.println("Il risultato della potenza è: "+base);
    }
    
    public void cambiaBase()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Cambia la base con cui vuoi calcolare la potenza: ");
        int nuovaBase = input.nextInt();
        input.close();
        this.base = nuovaBase;
        this.base *= this.base; 
        System.out.println("Questo è il nuovo risultato con base "+nuovaBase+": "+ base);
    }
}
