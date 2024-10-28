import enums.OrderStatus;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private int orderId;
    private OrderStatus status;
    private List<Meal> meals;

    public Order(int orderId) {
        this.orderId = orderId;
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean removeMeal(){
        return false;
    }
    public boolean setStatus(){
        return false;
    }

}
