import java.util.Scanner;
public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(result);
        sc.close();
    }
}
