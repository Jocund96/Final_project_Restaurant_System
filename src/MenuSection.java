import java.util.ArrayList;
import java.util.List;

public class MenuSection {
    private int menuSectionID;
    private String title;
    private String description;
    private String name;
    private List<MenuItem> items;


    public MenuSection(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    public void addItem(MenuItem item) {
        items.add(item);
    }
    public List<MenuItem> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
}
