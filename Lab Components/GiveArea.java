public class GiveArea {
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        float areaRect=num1*num2;
        float areaSquare=num1*num2;
        System.out.println("Area of rectangle is "+areaRect);
        System.out.println("Area of square is "+areaSquare);
    }    
}
