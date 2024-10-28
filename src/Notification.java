import java.util.Date;

public class Notification {
    private int notificationID;
    private Date createdOn;
    private String content;

    public Notification(int notificationID, Date createdOn, String content) {
        this.notificationID = notificationID;
        this.createdOn = createdOn;
        this.content = content;
    }

    // Геттеры и сеттеры
    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Метод для отправки уведомления
    public boolean send() {
        if (content != null && !content.isEmpty()) {
            System.out.println("Notification sent: " + content);
            return true;
        } else {
            System.out.println("Notification content is empty.");
            return false;
        }
    }
}
