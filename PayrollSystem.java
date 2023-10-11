import java.util.ArrayList;

class AdminSystem {
    private String name;
    private int employeeId;
    private double salary;

    public AdminSystem(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

public class PayrollSystem {
    private ArrayList<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculatePayroll() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Payroll Report:");
        payrollSystem.calculatePayroll();
    }
}
