public class Max3CLA {
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int num3=Integer.parseInt(args[2]);

        int largest=num1;
        if(num2>largest){
            largest=num2;
        }
        if(num3>largest){
            largest=num3;
        }
        System.out.println("Largest number is "+largest);
    }
}


// javac Max3CLA.java
// java Max3CLA 30 10 20
// Largest number is 30