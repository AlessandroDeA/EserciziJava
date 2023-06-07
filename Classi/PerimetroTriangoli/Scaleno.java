package Classi.PerimetroTriangoli;

public class Scaleno extends TestTriangolo{
    
    private int l1, l2, l3, p;

    Scaleno(int L1, int L2, int L3)
    {
        if(isT(L1, L2, L3) == true)
        {
            p = peri(L1, L2, L3);
        }
        else 
        p = 0;
    }

    public int getS()
    {
        return p;
    }
}
