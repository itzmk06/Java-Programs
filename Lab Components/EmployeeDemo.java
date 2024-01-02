import java.util.*;
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println("Salary raised by " + percent + "%. New salary: $" + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
    }

    public void displayUpdatedDetails() {
        System.out.println("\nUpdated Employee Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();

        System.out.println("Enter Employee Name:");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Employee Salary:");
        double employeeSalary = scanner.nextDouble();

        Employee employee1 = new Employee(employeeId, employeeName, employeeSalary);

        employee1.displayDetails();

        System.out.println("\nEnter the percentage to raise the salary:");
        double raisePercentage = scanner.nextDouble();

        employee1.raiseSalary(raisePercentage);

        employee1.displayUpdatedDetails();

        scanner.close();
    }
}
