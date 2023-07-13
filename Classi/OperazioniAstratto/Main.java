package Classi.OperazioniAstratto;
public class Main {

	public static void main(String[] args) {

		Calcolo calcoli = new Calcolo(22.5,0.5);
		
		System.out.println(calcoli.Addizione());
		System.out.println(calcoli.Sottrazione());
		System.out.println(calcoli.Divisione());
		System.out.println(calcoli.Moltiplicazione());
		System.out.println();
		System.out.println(calcoli.Addizione1(10.5,2));
		System.out.println(calcoli.Sottrazione1(10.5,2));
		System.out.println(calcoli.Divisione1(10.5,2));
		System.out.println(calcoli.Moltiplicazione1(10.5,2));
	}

}
