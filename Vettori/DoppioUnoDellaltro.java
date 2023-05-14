package Vettori;

public class DoppioUnoDellaltro {
    public static void main(String[] args) {
        int[] numeri = {3, 8, 5, 2, 10, 7, 9, 4, 6, 12};

        boolean isDoppio = false;

        for(int i = 0; i < numeri.length -1; i++)
        {
            for(int c = i + 1; c < numeri.length; c++)
            {
                if(numeri[c]*2 == numeri[i] || numeri[i]*2 == numeri[c])
                {
                    isDoppio = true;
                    break;
                }
            }
            if(isDoppio)
                break;
        }

        if(isDoppio)
            System.out.println("Doppio uno dell' altro");
        else
            System.out.println("NO");
    }
}
