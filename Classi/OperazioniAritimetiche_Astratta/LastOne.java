package Classi.OperazioniAritimetiche_Astratta;

public class LastOne extends OperazioniIntermedio{

    @Override
    public double Somma(String s) {

        String [] ls = s.split("\\+");

        double sum = 0;

        for(int i = 0; i < ls.length; i++)
        {
            sum += Double.parseDouble(ls[i]);
        }

        return sum;
    }
    
}
