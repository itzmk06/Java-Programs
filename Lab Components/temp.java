interface info
{
    public void email();
    interface audio
    {
        void call();
    }
}

class nested_interface_in_interface implements info, info.audio {

    int a = 5;

    public void email()
    {
        System.out.println("you received information from email" + "value of 'a' is " + this.a);
    }
    public void call()
    {
        System.out.println("you got info from call");
        System.out.println("value here "+a);
    }

    void method()
    {
        System.out.println("this method is being printed from the class method!");
    }

}
public class temp{
    public static void main(String []args)
    {
        info.audio obj1 = new nested_interface_in_interface();
        // obj1.email();
        obj1.call();
        // obj1.method();
        // System.out.println("the value of instance variable from object 1 is " + obj1.a);

        nested_interface_in_interface obj2 = new nested_interface_in_interface();
        obj2.email();
        obj2.call();
        obj2.method();
        System.out.println("the value of instance variable from object 2 is " + obj2.a);

    }
}