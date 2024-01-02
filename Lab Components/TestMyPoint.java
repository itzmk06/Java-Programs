import java.util.Scanner;

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }
}

public class TestMyPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1:");
        System.out.print("Enter x: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y: ");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for Point 2:");
        System.out.print("Enter x: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y: ");
        int y2 = scanner.nextInt();

        MyPoint point1 = new MyPoint(x1, y1);
        MyPoint point2 = new MyPoint(x2, y2);

        System.out.println("\nPoint 1 coordinates: " + point1);
        System.out.println("Point 2 coordinates: " + point2);

        System.out.println("Distance from point1 to point2: " + point1.distance(point2));
        System.out.println("Distance from point2 to the origin: " + point2.distance());

        scanner.close();
    }
}
