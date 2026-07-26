public class LogicalOperators {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;
        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);
        System.out.println("\nLogical AND (&&)");
        System.out.println(age >= 18 && hasLicense);
        System.out.println("\nLogical OR (||)");
        System.out.println(age >= 18 || hasLicense);
        System.out.println("\nLogical NOT (!)");
        System.out.println(!hasLicense);
    }
}