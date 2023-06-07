package Classi.Prodotti;

public class Main {
    public static void main(String[] args) {
        Prodotti prodotto = new Prodotti("1234567890", "Prodotto di esempio", 9.99);

        // Ottenere le informazioni del prodotto
        String codiceBarre = prodotto.getCodice();
        String descrizione = prodotto.getDescrizione();
        double prezzoUnitario = prodotto.getPrezzo();

        // Stampa delle informazioni
        System.out.println("Codice a barre: " + codiceBarre);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo unitario: " + prezzoUnitario);
    }
}
