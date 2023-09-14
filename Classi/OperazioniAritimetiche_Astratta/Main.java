package Classi.OperazioniAritimetiche_Astratta;
import java.util.Random;
public class Main extends LastOne
{
    public static void main(String[] args) {
        
        LastOne calcola = new LastOne();
        Random rand = new Random();

        double min =  Double.MIN_VALUE;
        double max =  Double.MAX_VALUE;

        double a = min + (max - min) * rand.nextDouble();
        double b = min + (max - min) * rand.nextDouble();

        System.out.println("Primo numero generato randomicamente: " + a);
        System.out.println("Secondo numero generato randomicamente: " + b);

        System.out.println("Somma: " + calcola.Somma("10+25+78.5+0.11247"));
        System.out.println("Sottraione: " + calcola.Sottrazione(a , b));
        System.out.println("Moltiplicazione: " + calcola.Moltiplicazione(a , b));
        System.out.println("Divisione: " + calcola.Divisione(a , b));
    }
}
