package Classi.Veicoli;

public class Moto extends Veicolo{
    public int numPosti;
	
	public void assegnaNumPosti(int numPosti) 
	{
		this.numPosti = numPosti;
	}
	
	public int dammiNumPosti() 
	{
		return this.numPosti;
	}
}
