public class CreditCardTransaction extends Payment {
    private String nameOnCard;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardTransaction(double amount, String nameOnCard, String cardNumber, String expiryDate, String cvv) {
        super(amount);
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    // Геттеры и сеттеры
    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    // Метод для обработки транзакции
    public boolean processPayment() {
        if (cardNumber != null && !cardNumber.isEmpty() && expiryDate != null && !expiryDate.isEmpty() && cvv != null && !cvv.isEmpty()) {
            System.out.println("Payment processed successfully with card number: " + cardNumber);
            return true;
        } else {
            System.out.println("Invalid card details.");
            return false;
        }
    }
}
