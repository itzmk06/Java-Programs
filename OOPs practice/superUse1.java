class Box{
    private double h;
    private double w;
    private double l;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Box(Box ob){
        this.h=ob.h;
        this.l=ob.l;
        this.w=ob.w;
    }
    Box(double h,double w,double l){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box(double len){
        this.l=this.w=this.h=len;
    }
    public double VolumeCal(){
        return this.l*this.h*this.w;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
    }
    BoxWeight(double l,double h,double w,double weight){
        super(h,w,l);
        this.weight=weight;
    }
    BoxWeight(BoxWeight ob,double weight){
        super(ob);
        this.weight=weight;
    }
    BoxWeight(double len,double weight){
        super(len);
        this.weight=weight;
    }
}

public class superUse1 {
    public static void main(String[] args){
        double volume;

        BoxWeight myBox1 = new BoxWeight();
        BoxWeight myBox2=new BoxWeight(10,20,30,40);
        BoxWeight myBox3=new BoxWeight(myBox1,10);
        BoxWeight myBox4=new BoxWeight(20,40);

        System.out.println();
        volume=myBox1.VolumeCal();
        System.out.println("myBox1 details:");
        System.out.println("volume is "+volume);
        System.out.println("Weight is "+myBox1.weight);

        System.out.println();
        volume=myBox2.VolumeCal();
        System.out.println("myBox2 details:");
        System.out.println("volume is "+volume);
        System.out.println("Weight is "+myBox2.weight);

        System.out.println();
        volume=myBox3.VolumeCal();
        System.out.println("myBox3 details");
        System.out.println("volume is "+volume);
        System.out.println("Weight is "+myBox3.weight);

        System.out.println();
        volume=myBox4.VolumeCal();
        System.out.println("myBox4 details");
        System.out.println("volume is "+volume);
        System.out.println("Weight is "+myBox4.weight);
    }
}
