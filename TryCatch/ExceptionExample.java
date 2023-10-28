package TryCatch;

public class ExceptionExample {
    public void throwNullPointerException() throws NullPointerException {
        String str = null;
        if (str.length() == 0) {
            throw new NullPointerException("La stringa è nulla.");
        }
    }

    public void throwArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        int[] array = {1, 2, 3};
        if (array.length < 4) {
            throw new ArrayIndexOutOfBoundsException("L'indice specificato è fuori dall'array.");
        }
    }

    public void throwArithmeticException() throws ArithmeticException {
        int a = 5;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero.");
        }
        int result = a / b;
    }

    public void throwNumberFormatException() throws NumberFormatException {
        String str = "abc";
            int value = Integer.parseInt(str);
            if(value == 0)
                throw new NumberFormatException("La stringa non può essere convertita in un numero.");
        }
    }