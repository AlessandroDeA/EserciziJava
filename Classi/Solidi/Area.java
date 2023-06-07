package Classi.Solidi;

public class Area {
    
    public int altezza, base, area;
    public void setArea(int x, int y)
    {
        altezza = x;
        base = y;
        mul();
    }
    
    private void mul()
    {
        area = altezza*base;
    }

    public int getArea()
    {
        return area;
    }
}
