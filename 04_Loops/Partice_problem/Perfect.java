import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++) {

            if (number % divisor == 0) {
                sum = sum + divisor;
            }
        }
        if (sum == number) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        scanner.close();
    }
}
