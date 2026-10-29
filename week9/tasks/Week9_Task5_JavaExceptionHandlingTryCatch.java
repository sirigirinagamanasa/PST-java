import java.util.Scanner;

public class Week9_Task5_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers");
        } finally {
            sc.close();
            System.out.println("Program completed");
        }
    }
}
