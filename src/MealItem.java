public class MealItem {
    private int mealItemID;
    private int quantity;
    private MenuItem menuItem;

    public MealItem(int mealItemID, MenuItem menuItem, int quantity) {
        this.mealItemID = mealItemID;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры
    public int getMealItemID() {
        return mealItemID;
    }

    public void setMealItemID(int mealItemID) {
        this.mealItemID = mealItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    // Метод для обновления количества
    public boolean updateQuantity(int newQuantity) {
        if (newQuantity > 0) {
            this.quantity = newQuantity;
            return true;
        } else {
            System.out.println("Invalid quantity.");
            return false;
        }
    }

    // Метод для получения общей стоимости элемента
    public double getTotalCost() {
        return menuItem.getPrice() * quantity;
    }

    public double getPrice() {
        return menuItem.getPrice();
    }
}
