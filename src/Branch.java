import java.util.ArrayList;
import java.util.List;

public class Branch {
    private Address location;
    private String name;
    private Menu menu;
    private List<Table> tables;
    private List<Employee> employees;

    public Branch(String name, Address location) {
        this.name = name;
        this.location = location;
        this.menu = new Menu();
        this.tables = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public boolean addTableChart(TableChart tableChart) {
        // Логика добавления схемы столов
        // Предположим, что метод возвращает true, если схема успешно добавлена
        return true;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Address getLocation() {
        return location;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Menu getMenu() {
        return menu;
    }

    public List<Table> getTables() {
        return tables;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
