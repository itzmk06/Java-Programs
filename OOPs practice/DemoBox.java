class A{
    public int l;
    public int b;
    public int h;
    public A(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    public A(A ob){
        this.l=ob.l;
        this.b=ob.b;
        this.h=ob.h;
    }
    public A(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
}
class CreateBox extends A{
    public CreateBox(int l,int b,int h){
        super(l, b, h);
    }
    public CreateBox(A ob){
        super(ob);
    }
    public CreateBox(){
        super();
    }
    public void displayVolume(){
        int vol=this.l*this.b*this.h;
        System.out.println("Volume is "+vol);
}
}
public class DemoBox {
    public static void main(String[] args){
        //method 1 of creating
        CreateBox ob=new CreateBox(10,20,30);
        ob.displayVolume();
        //method 2 of creating
        CreateBox ob1 =new CreateBox(ob);
        ob1.displayVolume();
        // //method 3 of creating
        CreateBox ob2 =new CreateBox();
        ob2.displayVolume();
    }
}
