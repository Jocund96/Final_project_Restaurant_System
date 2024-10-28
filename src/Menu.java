import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuSection> sections;

    public Menu() {
        this.sections = new ArrayList<>();
    }

    // Метод для добавления секции
    public void addSection(MenuSection section) {
        sections.add(section);
    }

    // Метод для удаления секции
    public boolean removeSection(MenuSection section) {
        return sections.remove(section);
    }

    // Метод для получения всех секций
    public List<MenuSection> getSections() {
        return sections;
    }

    // Метод для получения секции по имени
    public MenuSection getSectionByName(String name) {
        for (MenuSection section : sections) {
            if (section.getName().equalsIgnoreCase(name)) {
                return section;
            }
        }
        return null;
    }

    // Метод для получения всех элементов меню
    public List<MenuItem> getAllMenuItems() {
        List<MenuItem> allItems = new ArrayList<>();
        for (MenuSection section : sections) {
            allItems.addAll(section.getItems());
        }
        return allItems;
    }
}
