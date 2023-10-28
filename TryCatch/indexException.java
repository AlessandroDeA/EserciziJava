package TryCatch;
import java.util.Scanner;;
public class indexException {
    public static void main(String[] args) {
            int[] array = {1,2,3,4};

            Scanner scanner = new Scanner(System.in);

            try
            {
                System.out.println("Inserisci un numero intero: ");
                int indice =  scanner.nextInt();
                System.out.println("Il valore corrispondente all'indice inserito è: " + array[indice]);
                scanner.close();
            }
            catch(Exception ex)
            {
                System.out.println("Errore: l'indice inserito è maggiore di " + array.length);
            }
    }
    
}