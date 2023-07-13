package Classi.OperazioniAstratto;
public class Calcolo extends Operazioni{

	double x,y;
	
	public Calcolo(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public double Addizione() {
		double somma = this.x + this.y;
		return somma;
	}

	@Override
	public double Sottrazione() {
		double sottrazione = this.x - this.y;
		return sottrazione;
	}

	@Override
	public double Divisione() {
		double divisione = this.x / this.y;
		if(this.x == 0) 
		{
			System.out.println("Impossibile dividere per 0");
		}
		return divisione;
	}

	@Override
	public double Moltiplicazione() {
		double moltiplicazione = this.x * this.y;
		return moltiplicazione;
	}

	@Override
	public double Addizione1(double x, double y) {
		
		return x+y;
	}

	@Override
	public double Sottrazione1(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double Moltiplicazione1(double x, double y) {

		return x*y;
	}

	@Override
	public double Divisione1(double x, double y) {
		double divisione = 0;
		if(x == 0) 
		{
			System.out.println("Impossibile dividere per 0");
		}
		else
			divisione = x/y;
		return divisione;
	}
}
