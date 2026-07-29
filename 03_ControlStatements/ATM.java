public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            System.out.println("Withdrawal Successful");
        }
        System.out.println("Thank you for using the ATM.");
    }
}
