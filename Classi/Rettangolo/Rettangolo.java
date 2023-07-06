package Classi.Rettangolo;

public class Rettangolo {

    public double altezza, base, area, perimetro;


    public Rettangolo (double altezza, double base)
    {
        this.altezza = altezza;
        this.base = base;
    }

    public double Perimentro()
    {
        this.perimetro = (this.altezza*2)+(this.base*2);
        return this.perimetro;
    }

    public double Area()
    {
        this.area = this.altezza*this.base;
        return this.area;
    }
}
