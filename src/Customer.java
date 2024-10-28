import java.util.Date;

public class Customer extends Person {
    private Date lastVisited;

    public Customer(String name, String phone, String email, Date lastVisited) {
        super(name, phone, email);
        this.lastVisited = lastVisited;
    }

    // Геттеры и сеттеры
    public Date getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(Date lastVisited) {
        this.lastVisited = lastVisited;
    }

    // Метод для обновления даты последнего визита
    public void updateLastVisited(Date date) {
        this.lastVisited = date;
    }
}
