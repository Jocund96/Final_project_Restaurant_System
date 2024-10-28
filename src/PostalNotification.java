import java.util.Date;

public class PostalNotification extends Notification{
    private String phone;

    public PostalNotification(int notificationID, Date createdOn, String content) {
        super(notificationID, createdOn, content);
    }
}
