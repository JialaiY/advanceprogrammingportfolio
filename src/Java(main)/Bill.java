public class Bill {
    String billType;
    double amount;
    boolean isPaidOnTime;
    double interestRate;

    public Bill(String billType, double amount, boolean isPaidOnTime, double interestRate) {
        this.billType = billType;
        this.amount = amount;
        this.isPaidOnTime = isPaidOnTime;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        if (!isPaidOnTime) {
            return amount * (interestRate / 100);
        }
        return 0;
    }

    public double totalAmount() {
        return amount + calculateInterest();
    }
}