import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double cgpa;
        final String COLLEGE = "Dr. Mahalingam College of Engineering and Technology";
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();
        int cgpaInt = (int) cgpa;
        System.out.println("\n----- Student Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("CGPA    : " + cgpa);
        System.out.println("CGPA (Integer) : " + cgpaInt);
        System.out.println("College : " + COLLEGE);

        sc.close();
    }
}
