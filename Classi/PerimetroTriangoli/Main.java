package Classi.PerimetroTriangoli;

public class Main {
    public static void main(String[] args) {
        Scaleno S = new Scaleno(5, 3, 7);
        Isoscele I = new Isoscele(5,3);
        System.out.println(S.getS());
        System.out.println(I.getI());
    }
}
