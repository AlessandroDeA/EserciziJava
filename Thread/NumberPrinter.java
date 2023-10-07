package Thread;

public class NumberPrinter implements Runnable {
    private final int start;
    private final int end;
    private final int column;

    public NumberPrinter(int start, int end, int column) {
        this.start = start;
        this.end = end;
        this.column = column;
    }

    public void run() {
        int step = start < end ? 1 : -1;
        for (int i = start; (step > 0) ? i <= end : i >= end; i += step) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            printNumber(i, column);
        }
    }

    private synchronized void printNumber(int number, int column) {
        for (int i = 0; i < column; i++) {
            System.out.print("\t");
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        NumberPrinter print = new NumberPrinter(1, 50, 10);
        Thread t = new Thread(print);
        t.start();
    }
}