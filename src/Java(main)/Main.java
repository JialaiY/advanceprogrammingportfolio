//Jialai Ying | Sep 6 2024 | BillTracker
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BillTracker tracker = new BillTracker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many bills do you want to enter? ");
        int numBills = scanner.nextInt();

        for (int i = 0; i < numBills; i++) {
            // asks user for input on bill type
            System.out.print("Enter the type of bill: ");
            String billType = scanner.next();
            
            // asks user for input on bill amount
            System.out.print("Enter the amount of the bill: ");
            double amount = scanner.nextDouble();
            
            //asks user for input if bill was paid on time
            System.out.print("Was the bill paid on time? (true/false): ");
            boolean isPaidOnTime = scanner.nextBoolean();
            
            //asks user for input on interest rate
            System.out.print("Enter the interest rate for late payment (in %): ");
            double interestRate = scanner.nextDouble();

            Bill bill = new Bill(billType, amount, isPaidOnTime, interestRate);
            tracker.addBill(bill);
        }

        // Output total bills and total price after input
        System.out.println("\nTotal number of bills: " + tracker.getTotalBills());
        System.out.println("Total amount (including any interest): $" + tracker.calculateTotalPrice());
        
        scanner.close();
    }
}