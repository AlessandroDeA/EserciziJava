package Classi.Veicoli;

public class Automobile extends Veicolo{
	public String tipo;
	
	public void assegnaTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	
	public String dammiTipo() 
	{
		return this.tipo;
	}
}

