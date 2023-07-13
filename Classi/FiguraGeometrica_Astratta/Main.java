package Classi.FiguraGeometrica_Astratta;
public class Main {

	public static void main(String[] args) {
		
		Triangolo triangolo = new Triangolo(10,20,30);
		
		System.out.println("Perimetro triangolo: " + triangolo.perimetro());
		System.out.println("Area triangolo: " + triangolo.area());
		
		System.out.println();
		
		Rettangolo rettangolo = new Rettangolo(22.5,16.2);
		
		System.out.println("Perimetro rettangolo: " + rettangolo.perimetro());
		System.out.println("Area rettangolo: " + rettangolo.area());
	}

}
