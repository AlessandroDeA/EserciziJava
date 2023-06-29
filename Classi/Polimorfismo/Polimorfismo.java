package Classi.Polimorfismo;

public class Polimorfismo {

	 public int moltiplicazione(int b1, int b2) 
	 {
		 int moltiplicazione = b1*b2;
		 return moltiplicazione;
	 }
	 
	 public int moltiplicazione(int b1, int b2, int b3) 
	 {
		 int moltiplicazione = b1*b2*b3;
		 return moltiplicazione;
	 }
	 public String trasforma(String testo) 
	 {
		 String stringa = testo.concat("!");
		 return stringa;
	 }
	 
	 public String trasforma(String testo, String testo1) 
	 {
		 String stringa = testo.concat(testo1);
		 return stringa;
	 }
}
