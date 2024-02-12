public class p65 {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");

            try {
                // Nested try block
                System.out.println("Nested try block starts.");

                int[] array = new int[10];
                array[11] = 10;  // This will throw an ArrayIndexOutOfBoundsException

                System.out.println("This statement will not be reached in the nested try block.");

            } catch (ArrayIndexOutOfBoundsException nestedException) {
                // Catching the exception thrown in the nested try block
                System.out.println("Caught ArrayIndexOutOfBoundsException in the nested try block.");

                // Rethrowing the exception to the outer catch block
                throw nestedException;

            } finally {
                // Nested finally block
                System.out.println("Nested finally block is executed.");
            }

            System.out.println("This statement will not be reached in the outer try block.");

        } catch (ArrayIndexOutOfBoundsException outerException) {
            // Catching the exception thrown in the outer try block
            System.out.println("Caught ArrayIndexOutOfBoundsException in the outer try block.");
            System.out.println(outerException.getMessage() + " is thrown from nested.");

        } finally {
            // Outer finally block
            System.out.println("Outer finally block is executed.");
        }

        System.out.println("Program continues after the try,catch, and finally blocks.");
    }
}
