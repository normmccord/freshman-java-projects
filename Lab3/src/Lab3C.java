import java.util.*;
public class Lab3C {
    public static void main(String[] args) {
        final int QUARTERVALUE = 25;
        final int DIMEVALUE = 10;
        final int NICKELVALUE = 5;
        final int PENNYVALUE = 1;
        int totalQuarters;
        int totalDimes;
        int totalNickels;
        int totalPennies;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        totalQuarters = sc.nextInt();

        System.out.print("Enter the number of dimes: ");
        totalDimes = sc.nextInt();

        System.out.print("Enter the number of nickels: ");
        totalNickels = sc.nextInt();

        System.out.print("Enter the number of pennies: ");
        totalPennies = sc.nextInt();
        System.out.println();

        System.out.println("You entered " + totalQuarters + " quarters.");
        System.out.println("You entered " + totalDimes + " dimes.");
        System.out.println("You entered " + totalNickels + " nickels.");
        System.out.println("You entered " + totalPennies + " pennies.");

        int totalValue = (totalQuarters*QUARTERVALUE)+(totalDimes*DIMEVALUE)+(totalNickels*NICKELVALUE)+(totalPennies*PENNYVALUE);
        System.out.println();

        System.out.println ("Your total is "+ (totalValue/100) + " dollars and " + (totalValue % 100 ) + " cents.");
    }
}

