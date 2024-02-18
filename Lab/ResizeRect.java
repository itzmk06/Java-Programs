import java.util.*;
    interface Resizable {
        void resizeWidth(int width);
        void resizeHeight(int height);
    }
    
    class Rectangle implements Resizable {
        private int width;
        private int height;
    
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    
        public int getWidth() {
            return width;
        }
    
        public int getHeight() {
            return height;
        }
    
        @Override
        public void resizeWidth(int width) {
            this.width = width;
            System.out.println("Resized width to: " + width);
        }
    
        @Override
        public void resizeHeight(int height) {
            this.height = height;
            System.out.println("Resized height to: " + height);
        }
    }
    
    public class ResizeRect {
        public static void main(String[] args) {
            int w,h,rw,rh;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter current width:");
            w= sc.nextInt();
            System.out.print("Enter current higt:");
            h=sc.nextInt();
            Rectangle rectangle = new Rectangle(w, h);
            System.out.println();
            System.out.println("Initial Width: " + rectangle.getWidth());
            System.out.println("Initial Height: " + rectangle.getHeight());
            System.out.println();
            System.out.println("Enter width and height to resize:");
            rw=sc.nextInt();
            rh=sc.nextInt();
            rectangle.resizeWidth(rw);
            rectangle.resizeHeight(rh);
            System.out.println();
            System.out.println("Final Width: " + rectangle.getWidth());
            System.out.println("Final Height: " + rectangle.getHeight());
            sc.close();
        }
    }
