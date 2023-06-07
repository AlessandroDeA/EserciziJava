package Classi.Prodotti;

public class Prodotti {
    protected String codiceBarre;
    protected String descrizioneP;
    protected double prezzoUnitario;

    Prodotti(String codice, String descrizione, double prezzo)
    {
        this.codiceBarre = codice;
        this.descrizioneP = descrizione;
        this.prezzoUnitario = prezzo;
    }

    public String getCodice()
    {
        return this.codiceBarre;
    }

    public String getDescrizione()
    {
        return this.descrizioneP;
    }

    public double getPrezzo()
    {
        return this.prezzoUnitario; 
    }
}
