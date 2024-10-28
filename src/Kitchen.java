import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private String name;
    private List<Chef> chefs;

    public Kitchen(String name) {
        this.name = name;
        this.chefs = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }

    // Метод для назначения шеф-повара
    public boolean assignChef(Chef chef) {
        if (chef != null) {
            chefs.add(chef);
            System.out.println("Chef " + chef.getName() + " assigned to kitchen " + name);
            return true;
        } else {
            System.out.println("Invalid chef.");
            return false;
        }
    }
}
