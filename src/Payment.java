import java.util.Date;

public class Payment implements PaymentInt {
    private int paymentID;
    private double amount;
    private Date creationDate;

    public Payment(int paymentID, double amount, Date creationDate) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.creationDate = creationDate;
    }

    public Payment(double amount) {
        this.amount = amount;
        this.creationDate = new Date();
    }

    public Payment() {

    }

    // Геттеры и сеттеры
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String paymentType() {

        return "Generic Payment";
    }

    @Override
    public String payOption() {
        return "Generic Option";
    }

    @Override
    public int tip() {
        return 0;
    }

    public boolean initiate_transaction() {
        if (amount > 0) {
            System.out.println("Transaction initiated for amount: $" + amount);
            return true;
        } else {
            System.out.println("Transaction failed. Invalid amount.");
            return false;
        }
    }
}
