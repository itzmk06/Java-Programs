class Say{
    public void disp(String name){
        System.out.println("Hello "+name+"!");
    }
    public void disp(int age){
        System.out.println("Your age is "+age);
    }
    public void disp(String name,int age){
        System.out.println("Hi "+name+" your age is "+ age);
    }
}
public class FunctionOverloading {
public static void main(String[] args) {
    Say s1=new Say();
    s1.disp("Manoj");
    s1.disp(19);
    s1.disp("Manoj",19);
    }
}


// Hello Manoj!
// Your age is 19
// Hi Manoj your age is 19