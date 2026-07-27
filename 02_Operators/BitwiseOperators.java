public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\nBitwise AND (&)");
        System.out.println("a & b = " + (a & b));

        System.out.println("\nBitwise OR (|)");
        System.out.println("a | b = " + (a | b));

        System.out.println("\nBitwise XOR (^)");
        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("\nBitwise NOT (~)");
        System.out.println("~a = " + (~a));

        System.out.println("\nLeft Shift (<<)");
        System.out.println("a << 1 = " + (a << 1));

        System.out.println("\nRight Shift (>>)");
        System.out.println("a >> 1 = " + (a >> 1));
    }
}
