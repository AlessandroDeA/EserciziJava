package Vettori;

public class treConsecutivi {
    public static void main(String[] args) {
        
    int [] numeri = {2, 4, 4, 7, 7, 7, 5, 9, 1, 3};

    boolean treConsecutivi = false;

    for(int i = 0; i < numeri.length-2; i++)
    {
        if(numeri[i] == numeri[i+1] && numeri[i] == numeri[i+2])
        {
            treConsecutivi = true;
            break;
        }
    }

        if(treConsecutivi)
            System.out.println("Ci sono tre valori consecutivi uguali.");
        else
            System.out.println("NO");    
    }
}
