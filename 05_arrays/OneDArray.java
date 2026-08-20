import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            numbers[index] = scanner.nextInt();
        }
        System.out.println("Array elements:");
        for (int index = 0; index < size; index++) {
            System.out.print(numbers[index] + " ");
        }
        scanner.close();
    }
}