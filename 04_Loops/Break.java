public class Break{
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 3; column++) {
                if (column == 2) {
                    break;
                }
                System.out.println("Row: " + row + ", Column: " + column);
            }
        }
    }
}