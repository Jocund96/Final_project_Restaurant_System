import java.util.ArrayList;
import java.util.List;

public class Meal {
    private int mealId;
    private List<MealItem> mealItems;

    public Meal(int mealId) {
        this.mealId = mealId;
        this.mealItems = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public List<MealItem> getMealItems() {
        return mealItems;
    }

    // Метод для добавления элемента в список mealItems
    public void addMealItem(MealItem mealItem) {
        mealItems.add(mealItem);
    }

    // Метод для удаления элемента из списка mealItems
    public boolean removeMealItem(MealItem mealItem) {
        return mealItems.remove(mealItem);
    }

    // Метод для получения общей стоимости всех элементов в mealItems
    public double getTotalCost() {
        double totalCost = 0;
        for (MealItem item : mealItems) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
