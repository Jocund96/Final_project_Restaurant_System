public class CashTransaction extends Payment {
    private double cashTendered;

    public CashTransaction(double amount, double cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }


    public double getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(double cashTendered) {
        this.cashTendered = cashTendered;
    }

    // Метод для обработки транзакции
    public boolean processPayment() {
        if (cashTendered >= getAmount()) {
            double change = cashTendered - getAmount();
            System.out.println("Payment successful. Change: $" + change);
            return true;
        } else {
            System.out.println("Insufficient cash tendered.");
            return false;
        }
    }
}
