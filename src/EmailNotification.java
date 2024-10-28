import java.util.Date;

public class EmailNotification extends Notification {
    private String email;

    public EmailNotification(int id, Date date, String message, String email) {
        super(id, date, message);
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для отправки уведомления по электронной почте
    @Override
    public boolean send() {
        if (getEmail() != null && !getEmail().isEmpty()) {
            System.out.println("Sending email to " + getEmail() + ": " + getContent());
            return true;
        } else {
            System.out.println("Invalid email address.");
            return false;
        }
    }
}