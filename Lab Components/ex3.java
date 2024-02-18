import java.util.*;
class student{
    String name;
    int age;
    Scanner sc=new Scanner(System.in);
    student(){
        this.name="";
        this.age=0;
    }
    student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void arithmatic(){
        int option;
        int num1,num2;
        System.out.println("Select (+,-,*,/)");
        System.out.println("Enter any choice:");
        option=sc.nextInt();
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        switch(option){
            case 1:
            System.out.println("The sum is "+(num1+num2));
            break;
            case 2:
            System.out.println("The difference is "+(num1-num2));
            break;
            case 3:
            System.out.println("The product is "+(num1*num2));
            break;
            case 4:
            try{
                double result=num1/num2;
                System.out.println("The division is "+result);
            }
            catch(ArithmeticException e){
                System.out.println("An error occured!"+e.getMessage());
            }
        }
    }
    public void display(){
        System.out.println("Name :"+this.name+" Age :"+this.age);
        sc.close();
    }
}
public class ex3 {
    public static void main(String[] args){
        student s=new student("Manoj",19);
        s.arithmatic();
        s.display();
    }
}
