import Pack2.AddNumbers;
import java.util.Scanner;

public class p62 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = input.nextInt();

        System.out.print("Enter the second number: ");
        b = input.nextInt();

        AddNumbers obj = new AddNumbers(a, b);

        System.out.println("Sum: " + obj.getSum());
    }
}
