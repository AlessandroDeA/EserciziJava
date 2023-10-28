package TryCatch;

public class MainException {
    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();

        try 
        {
            exceptionExample.throwNullPointerException();
            exceptionExample.throwArrayIndexOutOfBoundsException();
            exceptionExample.throwArithmeticException();
            exceptionExample.throwNumberFormatException();
        }
         catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}