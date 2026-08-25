public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};
        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int index = 0; index < numbers.length - 1 - pass; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temporary = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temporary;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
