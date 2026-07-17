public class TypeCasting {

    public static void main(String[] args) {
        int num = 100;
        double value = num;
        System.out.println("Integer Value : " + num);
        System.out.println("Double Value  : " + value);
        double pi = 3.14159;
        int integerValue = (int) pi;

        System.out.println("Original Double : " + pi);
        System.out.println("After Casting   : " + integerValue);
    }
}