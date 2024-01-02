class Employee{
    String emp_name;
    int  emp_id;
    String emp_gender;
    Employee(String name,int id,String gender){
        this.emp_name=name;
        this.emp_id=id;
        this.emp_gender=gender;
    }
    Employee(){
        this.emp_name="";
        this.emp_id=0;
        this.emp_gender="";
    }
}
class Department extends Employee{
    String emp_department;
    String emp_work_assinged;
    Department(String departement,String work){
        super();
        this.emp_department=departement;
        this.emp_work_assinged=work;
    }
    Department(){
        super();
        this.emp_department="";
        this.emp_work_assinged="";
    }
}
class LoanAmount extends Employee{
    double emp_amount;
    String emp_loan_details;
    LoanAmount(double amount,String details){
        super();
        this.emp_amount=amount;
        this.emp_loan_details=details;
    }    LoanAmount(){
        super();
        this.emp_amount=0;
        this.emp_loan_details="";
    }

}
public class EmployeeDetails {
    public static void main(String[] args){
        Employee e=new Employee("Manoj",109,"Male");
        Department d=new Department("FullStack", "AI Driven Nuclear Reactor");
        LoanAmount a =new LoanAmount(1000000, "MernStack");
        System.out.println();
        System.out.println("Employee name :"+e.emp_name);
        System.out.println("Employee id :"+e.emp_id);
        System.out.println("Employee gender:"+e.emp_gender);
        System.out.println("Employee department :"+d.emp_department);
        System.out.println("Employee work :"+d.emp_work_assinged);
        System.out.println("Employee fund amount :"+a.emp_amount);
        System.out.println("Employee details :"+a.emp_loan_details);
    }
}


// output
// Employee name :Manoj
// Employee id :109
// Employee gender:Male
// Employee department :FullStack
// Employee work :AI Driven Nuclear Reactor
// Employee fund amount :1000000.0
// Employee details :MernStack
