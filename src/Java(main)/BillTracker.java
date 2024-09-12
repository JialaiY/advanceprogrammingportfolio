import java.util.ArrayList;

public class BillTracker {
    ArrayList<Bill> bills;

    public BillTracker() {
        bills = new ArrayList<>();
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Bill bill : bills) {
            total += bill.totalAmount();
        }
        return total;
    }

    public int getTotalBills() {
        return bills.size();
    }
}