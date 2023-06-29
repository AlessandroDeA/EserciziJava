package Classi.Polimorfismo;

public class Main {

	public static void main(String[] args) {

		Polimorfismo prova = new Polimorfismo();
		
		int x = prova.moltiplicazione(60, 80);
		int y = prova.moltiplicazione(80, 10, -10);
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(prova.trasforma("Ciao"));
		System.out.println(prova.trasforma("Forza ", "Napoli!"));
		
		Persona persona = new Persona("Mario", "Rossi");
        persona.saluta();

        Dirigente dirigente = new Dirigente("Carlo", "Bianchi", "Direttore");
        dirigente.saluta();  
	}

}
