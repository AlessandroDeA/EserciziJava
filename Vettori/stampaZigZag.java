package Vettori;

public class stampaZigZag
{
    public static void main(String[] args) {
        
        int array [] = {10,20,30,40,50,60,70,80,90,100};

        int i = 0;
        int j = array.length - 1;

        while(i <= j)
        {
            System.out.print(array[i]+" ");

            if(i !=j)
            System.out.print(array[j] + " ");

            i++;
            j--;
        }
    }
}