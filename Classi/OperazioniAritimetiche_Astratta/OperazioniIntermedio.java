package Classi.OperazioniAritimetiche_Astratta;

public abstract class OperazioniIntermedio extends OperazioniAritmetiche{
    
    @Override
    public double Divisione (double a, double b)
    {
        double x = 0;
        
        if(b != 0)
            x = a / b;
        else
            System.out.println("Impossibile dividere per zero!");
        
        return x;
    }

    @Override
    public double Moltiplicazione (double a, double b)
    {
        return a * b;
    }

    @Override
    public double Sottrazione (double a, double b)
    {
        return a - b;
    }

}