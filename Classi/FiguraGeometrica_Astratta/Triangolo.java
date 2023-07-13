package Classi.FiguraGeometrica_Astratta;
public class Triangolo extends FiguraGeometrica{

	double p, l1,l2,l3;
	
	public Triangolo(double x, double y, double z) 
	{
		l1 = x;
		l2 = y;
		l3 = z;
	}
	
	@Override
	public double perimetro() {
		
		p = l1+l2+l3;
		return p;
	}

	@Override
	public double area() {
		
		p = perimetro();
		double semiP = p/2;
		double area = 0;
		
		if(semiP-l3 == 0) 
			area = Math.sqrt(semiP*(semiP-l1)*(semiP-l2));

		else if(semiP-l2 == 0)
			area = Math.sqrt(semiP*(semiP-l1)*(semiP-l3));
		
		else if(semiP-l1 == 0)
			area = Math.sqrt(semiP*(semiP-l2)*(semiP-l3));
		else 
			area = Math.sqrt(semiP*(semiP-l1)*(semiP-l2)*(semiP-l3));
		
		return area;
	}
	
	
}
