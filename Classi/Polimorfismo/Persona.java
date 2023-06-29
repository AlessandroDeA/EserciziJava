package Classi.Polimorfismo;

public class Persona {

	public String nome;
	public String cognome;
	
	public Persona(String nome, String cognome) 
	{
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void saluta() {
		
		System.out.println("Ciao, sono " + nome + " " + cognome +".");
	}
	
}
