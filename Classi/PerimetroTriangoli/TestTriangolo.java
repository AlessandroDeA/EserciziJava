package Classi.PerimetroTriangoli;

public class TestTriangolo {
    
    protected boolean isT(int x, int y, int z)
    {
        if((x+y)>z && (x+z)>y && (z+y)>x)
        {
            return true;
        }
        else return false;
    }

    protected  int peri(int i, int k, int w)
    {
        return i+k+w;
    }
}
