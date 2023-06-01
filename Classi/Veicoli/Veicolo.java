package Classi.Veicoli;

public class Veicolo {
	public int numeroMatricola;
	public String proprietario;
	
	public Veicolo() 
	{
		numeroMatricola = -1;
		proprietario = "GG";
	}
	
	public void assegnaProprietario(String proprietario) 
	{
		this.proprietario = proprietario;
	}
	
	public String dammiProprietario() 
	{
		return this.proprietario;
	}
	
	public void assegnaNumeroMatricola(int numeroMatricola) 
	{
		this.numeroMatricola = numeroMatricola;
	}
	
	public int dammiNumeroMatricola() 
	{
		return this.numeroMatricola;
	}
	
}