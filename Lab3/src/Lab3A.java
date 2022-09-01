import java.util.Scanner;
class Lab3A {
    public static void main(String[] args) {

        double amountOwed;
        double rate;
        double minPayment;
        double monthlyRate;

        Scanner scan = new Scanner(System.in);
        System.out.print("Amount owed: ");
        amountOwed = scan.nextDouble();

        System.out.print("$APR: ");
        rate = scan.nextDouble() / 100;

        monthlyRate = rate / 12;
        minPayment = amountOwed * rate / 12;

        System.out.println("Monthly percentage rate: " + (String.format("%.3f",(monthlyRate * 100))));
        System.out.println("Minimum payment: " + "$" + String.format("%.2f",minPayment));
    }
}
