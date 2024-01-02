class Student{
    String name;
    int age;
    int rollNumber;
    float fees;
    String course;
    public void dispDetails(){
        System.out.println("Student Name :"+this.name);
        System.out.println("Student Age :"+this.rollNumber);
        System.out.println("Student Fees :"+this.fees);
        System.out.println("Student Course :"+this.course);
    }
    //create a constructor 
    Student(String name,int age,int rollNumber,float fees,String course){
        System.out.println();
        System.out.println("Student Details:-");
        System.out.println();
        this.name=name;
        this.fees=fees;
        this.age=age;
        this.rollNumber=rollNumber;
        this.course=course;
    }
}
public class Introduction {
    public static void main(String[] args){
        Student s1=new Student("Manoj",19,109,98600,"ISE");
        s1.dispDetails();
        Student s2=new Student("Ketaki",19,110,98600,"ISE");
        s2.dispDetails();
    }
}
