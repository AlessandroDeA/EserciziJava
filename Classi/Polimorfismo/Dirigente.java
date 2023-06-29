package Classi.Polimorfismo;

public class Dirigente extends Persona{

	public String titolo;
	
	public Dirigente(String nome, String cognome, String titolo) 
	{
		super(nome, cognome);
		this.titolo = titolo;
	}
	
	//Override
	
	public void saluta() 
	{
		System.out.println("Ciao, sono " + titolo + " " + nome + " " + cognome + ".");
	}
}
