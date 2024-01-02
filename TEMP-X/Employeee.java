import java.util.*;
class EmployeeDetails{
    private int emp_id;
    private String emp_name;
    private double emp_salary;
    
    public EmployeeDetails(int id,String name,double salary){
        this.emp_id=id;
        this.emp_name=name;
        this.emp_salary=salary;
    }
    public void raiseSalary(int percent){
        this.emp_salary+=this.emp_salary*(percent/100);
        System.out.println("Updated "+this.emp_name+"' salary!");
    }
    public void display(){
        System.out.println("\nEmployee Details:-\n");
        System.out.println("Employee Name: "+this.emp_name);
        System.out.println("Employee ID: "+this.emp_id);
        System.out.println("Employee Salary: "+this.emp_salary);
    }
}
public class Employeee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        System.out.print("Enter salary: ");
        double salary=sc.nextDouble();
        EmployeeDetails emp1=new EmployeeDetails(id,name,salary);
        emp1.display();
        System.out.println();
        System.out.print("Enter raise percentage: ");
        System.out.println();
        int percent=sc.nextInt();
        emp1.raiseSalary(percent);
        emp1.display();
    }
}