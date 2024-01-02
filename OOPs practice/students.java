class Student{
    String student_name;
    String student_usn;
    int student_age;
    Student(){
        this.student_name="";
        this.student_usn="";
        this.student_age=0;
    }
    Student(String name,String usn,int age){
        this.student_name=name;
        this.student_usn=usn;
        this.student_age=age;
    }
}
class UGStudent extends Student{
    String student_semester;
    double student_fees;
    double student_cgpa;
    double student_stipend;
    UGStudent(){
        super();
        this.student_semester="";
        this.student_cgpa=0;
        this.student_fees=0;
        this.student_stipend=0;
    }
    UGStudent(String name,int age,String usn,String sem,double fees,double cgpa,double stipend){
        super(name,usn,age);
        this.student_cgpa=cgpa;
        this.student_semester=sem;
        this.student_stipend=stipend;
        this.student_fees=fees;
    }
}
public class students {
    public static void main(String[] args){
        UGStudent s1=new UGStudent("Manoj",19,"4NI22IS109","Third",98600.0,8.5,10000000.0);
        System.out.println("Student name: "+s1.student_name);
        System.out.println("Student age:"+s1.student_age);
        System.out.println("Student usn:"+s1.student_usn);
        System.out.println("Student sem:"+s1.student_semester);
        System.out.println("Student fees:"+s1.student_fees);
        System.out.println("Student cgpa:"+s1.student_cgpa);
        System.out.println("Student stipend:"+s1.student_stipend);

    }
}


//output

// Student name: Manoj
// Student age:19
// Student usn:4NI22IS109
// Student sem:Third
// Student fees:98600.0
// Student cgpa:8.5
// Student stipend:1.0E7
