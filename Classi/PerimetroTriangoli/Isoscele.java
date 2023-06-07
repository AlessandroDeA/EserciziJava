package Classi.PerimetroTriangoli;

public class Isoscele extends TestTriangolo{
    private int l1, l2, p;

    Isoscele(int L1, int L2)
    {
        if(isT(L1, L1, L2) == true)
        {
            p = peri(L1, L1, L2);
        }
        else
        p = 0;
    }

    public int getI()
    {
        return p;
    }
}
