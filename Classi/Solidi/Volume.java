package Classi.Solidi;

public class Volume extends Area{
    
    public int vol;

    Volume(int lunghezza, int larghezza, int altezza)
    {
        setArea(altezza, larghezza);
        vol = getArea()*lunghezza;
    }

    public int getV()
    {
        return vol;
    }
}
