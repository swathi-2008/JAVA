public class SelectionSort{
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};
        for (int currentIndex = 0;currentIndex < numbers.length - 1;currentIndex++) {
            int minimumIndex = currentIndex;
            for (int index = currentIndex + 1;
                 index < numbers.length;
                 index++) {

                if (numbers[index] < numbers[minimumIndex]) {
                    minimumIndex = index;
                }
            }
            int temporary = numbers[currentIndex];
            numbers[currentIndex] = numbers[minimumIndex];
            numbers[minimumIndex] = temporary;
        }
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}