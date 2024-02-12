import java.util.Scanner;

public class p66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int numerator = input.nextInt();

            System.out.print("Enter another number: ");
            int denominator = input.nextInt();

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } finally {
            System.out.println("Finally block is executed.");
            input.close();
        }

        System.out.println("Program continues after the try, catch, and finally blocks.");
    }
}
