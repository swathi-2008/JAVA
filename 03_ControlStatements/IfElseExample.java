import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = scanner.nextInt();
        if (mark >= 40) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }
        scanner.close();
    }
}