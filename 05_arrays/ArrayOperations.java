public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 23, 78, 34};
        int smallest = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }
        System.out.println("Smallest = " + smallest);
    }
}