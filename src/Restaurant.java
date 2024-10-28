import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Branch> branches;
    List<Employee> employees;

    public Restaurant(){
        this.branches = new ArrayList<>();
        this.employees = new ArrayList<>();

    }
    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Branch> getBranches() {
        return branches;
    }

}
