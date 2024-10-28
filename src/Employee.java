import enums.EmployeeStatus;
import java.util.Date;

public class Employee extends Person {
    private int employeeID;
    private Date dateJoined;
    private String position;
    private double salary;
    private String department;
    private EmployeeStatus status;

    public Employee(String name, String phone, String email, int employeeID, Date dateJoined, String position, double salary, String department, EmployeeStatus status) {
        super(name, phone, email);
        this.employeeID = employeeID;
        this.dateJoined = dateJoined;
        this.position = position;
        this.salary = salary;
        this.department = department;
        this.status = status;
    }

    public Employee() {

    }

    // Геттеры и сеттеры
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    // Метод для обновления статуса сотрудника
    public void updateStatus(EmployeeStatus newStatus) {
        this.status = newStatus;
    }

    // Метод для получения информации о сотруднике
    public String getEmployeeInfo() {
        return "Employee ID: " + employeeID + "\n" +
                "Name: " + getName() + "\n" +
                "Phone: " + getPhone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Date Joined: " + dateJoined + "\n" +
                "Position: " + position + "\n" +
                "Salary: " + salary + "\n" +
                "Department: " + department + "\n" +
                "Status: " + status;
    }
}
