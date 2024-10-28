public class MenuItem {
    private int menuItemID;
    private String title;
    private String description;
    private double price;

    public MenuItem(int menuItemID, String title, String description, double price) {
        this.menuItemID = menuItemID;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    // Геттеры и сеттеры
    public int getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для обновления цены
    public boolean updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            return true;
        } else {
            System.out.println("Invalid price.");
            return false;
        }
    }
}
