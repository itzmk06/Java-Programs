import java.util.*;

class EmployeeDetails{
    
    private String empName;
    private int empID;
    private double empSalary;

    public EmployeeDetails(String name,int id,double salary){
        this.empName=name;
        this.empID=id;
        this.empSalary=salary;
    }
    public void raiseSalary(double percent){
        if(percent>0){
            this.empSalary+=empSalary*(percent/100);
            System.out.println("\nUpdated "+this.empName+"'s salary!");
        }else{
            System.out.println("Sorry! this operation can't be done!");
        }
    }
    public void display(){
        System.out.println();
        System.out.println("Employee Details:-");
        System.out.println();
        System.out.println("Employee name: "+this.empName);
        System.out.println("Employee ID: "+this.empID);
        System.out.println("Employee Salary: "+this.empSalary);
    }
}
public class Employee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter ID:");
        int  id=sc.nextInt();
        System.out.print("Enter salary: ");
        double salary=sc.nextDouble();
        System.out.println();
        System.out.print("Enter salary raise percentage:");
        double raiseP=sc.nextDouble();

        EmployeeDetails emp1=new EmployeeDetails(name, id, salary);
        emp1.display();
        emp1.raiseSalary(raiseP);
        emp1.display();
        sc.close();
    }
}