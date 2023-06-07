package Classi.Veicoli;

public class TestVeicolo {
    public static void main(String[] args) {
		Automobile miaAuto = new Automobile();
		miaAuto.assegnaProprietario("Franco");
		miaAuto.assegnaNumeroMatricola(151324);
		
		miaAuto.assegnaTipo("City car");
		//-------------------------------//
		
		Camion camion_1 = new Camion();
		
		camion_1.assegnaNumeroMatricola(115163);
		camion_1.assegnaProprietario("Domenico");
		camion_1.assegnaRuote(8);
		
		//-------------------------------//
		
		Moto miaMoto = new Moto();
		
		miaMoto.assegnaNumPosti(2);
		miaMoto.assegnaNumeroMatricola(21821);
		miaMoto.assegnaProprietario("Michele");
		//-------------------------------//

		System.out.println("Auto di: "+ miaAuto.dammiProprietario()+"\nTipo d'auto: "+miaAuto.dammiTipo()+"\nNumero matricola dell'auto: "+miaAuto.dammiNumeroMatricola());
		System.out.println();
		System.out.println("Camion di: "+ camion_1.dammiProprietario()+"\nNumero di ruote : "+camion_1.dammiRuote()+"\nNumero matricola del camion: "+camion_1.dammiNumeroMatricola());
		System.out.println();
		System.out.println("Moto di: "+ miaMoto.dammiProprietario()+"\nNumero di posti: "+miaMoto.dammiNumPosti()+"\nNumero matricola dell'auto: "+miaMoto.dammiNumeroMatricola());
	}
}
