import java.util.Scanner;
class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a after swaping:" +a);
        System.out.println("value of b after swaping:" +b);
        sc.close();
    }
}
