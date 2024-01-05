interface Resizeable{
    public int resizeWidth(int width);
    public int resizeHeight(int hieght);
}
class Rectangle implements Resizeable{
    int width;
    int hieght;
    Rectangle(int width,int hieght){
        this.width=width;
        this.hieght=hieght;
    }
    @Override
    public int resizeWidth(int width){
        this.width=width;
        return this.width;
    }
    @Override
    public int resizeHeight(int hieght){
        this.hieght=hieght;
        return this.hieght;
    }
    void display(){
        System.out.println("width of rectanlge is "+this.width);
        System.out.println("Height of rectable is "+this.hieght);
    }
}
public class TheResize {
    public static void main(String[] args){
        Rectangle r=new Rectangle(10, 20);
        System.out.println("Before changes:");
        r.display();
        r.resizeHeight(200);
        r.resizeWidth(300);
        System.out.println("After changees;");
        r.display();
    }
}
