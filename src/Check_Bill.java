public class Check_Bill {
    private int checkID;
    private double amount;
    private double tip;
    private double tax;
    private boolean isPaid;

    public Check_Bill(int checkID, double amount, double tip, double tax) {
        this.checkID = checkID;
        this.amount = amount;
        this.tip = tip;
        this.tax = tax;
        this.isPaid = false;
    }

    // Геттеры и сеттеры
    public int getCheckID() {
        return checkID;
    }

    public void setCheckID(int checkID) {
        this.checkID = checkID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    // Метод для создания счета
    public boolean createBill() {
        if (amount > 0) {
            this.isPaid = false;
            return true;
        }
        return false;
    }

    // Метод для расчета общей суммы
    public double calculateTotal() {
        return amount + tip + tax;
    }

    // Метод для оплаты счета
    public boolean payBill() {
        if (!isPaid) {
            this.isPaid = true;
            return true;
        }
        return false;
    }
}
