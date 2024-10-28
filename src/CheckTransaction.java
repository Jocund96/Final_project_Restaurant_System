public class CheckTransaction extends Payment {
    private String bankName;
    private String checkNumber;

    public CheckTransaction(double amount, String bankName, String checkNumber) {
        super(amount);
        this.bankName = bankName;
        this.checkNumber = checkNumber;
    }

    // Геттеры и сеттеры
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    // Метод для обработки транзакции
    public boolean processPayment() {
        if (bankName != null && !bankName.isEmpty() && checkNumber != null && !checkNumber.isEmpty()) {
            System.out.println("Payment processed successfully with check number: " + checkNumber);
            return true;
        } else {
            System.out.println("Invalid check details.");
            return false;
        }
    }
}
