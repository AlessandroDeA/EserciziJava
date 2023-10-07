package Thread;

public class sumThreadMatrix implements Runnable {
    private int[][] matrix;

    public sumThreadMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void run() {
        int sum = calculateSum();
        System.out.println("Somma dei numeri pari " + sum);
    }
    
    private int calculateSum() {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sumThreadMatrix sommaThread = new sumThreadMatrix(matrix);
        Thread thread = new Thread(sommaThread);
        thread.start();
    }
}