class TheShape{
    void draw(){
        System.out.println("We're drawing a shape here!");
    }
    void erase(){
        System.out.println("We're erasing a shape here!");
    }
}
class Circle extends TheShape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a circle");
    }
}
class Square extends TheShape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a square");
    }
}
class Rectangle extends TheShape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a rectangle");
    }
}


public class Shape {
    public static void main(String[] args){
        Circle cirlce=new Circle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();

        ImplementPolymorphism(cirlce);
        ImplementPolymorphism(square);
        ImplementPolymorphism(rectangle);

    }
    public static void ImplementPolymorphism(TheShape s){
        s.draw();
        s.erase();
        System.out.println();
    }
}
