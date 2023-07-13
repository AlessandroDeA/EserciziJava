package Classi.FiguraGeometrica_Astratta;
public class Rettangolo extends FiguraGeometrica{

	double b,h;
	
	public Rettangolo(double x, double y) 
	{
		b = x;
		h = y;
	}
	
	@Override
	public double perimetro() {
		return (b*2)+(h*2);
	}

	@Override
	public double area() {
		
		return (b*h)/2;
	}

}
