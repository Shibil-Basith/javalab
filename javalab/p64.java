import java.util.Scanner;

public class p64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an array index (0 to 2): ");
            int index = input.nextInt();

            int[] numbers = {1, 2, 3};
            int result = numbers[index];
            System.out.println("result = " + result);  
            System.out.print("Enter a divisor for 10: ");
            int divisor = input.nextInt();
            int quotient = 10 / divisor;
            System.out.println("quotient = " + quotient);   

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } finally {
            System.out.println("Finally block is executed.");
        }

        System.out.println("Program continues after the try,catch, and finally blocks.");

    }
}
