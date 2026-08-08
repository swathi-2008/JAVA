public class Continue{
    public static void main(String[] args) {
        int[] numbers = {10, -5, 20, -2, 30};
        for (int number : numbers) {
            if (number < 0) {
                continue;
            }
            System.out.println("Processing: " + number);
        }
    }
}