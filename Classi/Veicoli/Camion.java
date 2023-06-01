package Classi.Veicoli;

public class Camion extends Veicolo{
    public int numeroRuote;
	
	public void assegnaRuote(int numeroRuote) 
	{
		this.numeroRuote = numeroRuote;
	}
	
	public int dammiRuote() 
	{
		return this.numeroRuote;
	}
}
