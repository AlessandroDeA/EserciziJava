package Thread;

public class sommaThreadMatrixnoForEach implements Runnable{
    private int [][] matrix;

    @Override
    
    public void run() {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int y = 0; y < matrix[i].length; y++)
            {
                if(matrix[i][y] % 2 == 0)
                    sum +=matrix[i][y];
            }
        }
        System.out.println(sum);
    }

    public sommaThreadMatrixnoForEach(int [][] matrix)
    {
        this.matrix = matrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {6,9,10},
            {4,5,7}
        };

        sommaThreadMatrixnoForEach somma = new sommaThreadMatrixnoForEach(matrix);
        Thread T = new Thread(somma);
        T.start();
    }
    
}
