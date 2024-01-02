public class ReverseInteger {
    public static void main(String[] args){
        int number=123456;
        int reversedNumber=0;
        System.out.println("Original number is "+number);
        while(number>0){
            int lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number/=10;
        }
        System.out.println("Reved number is "+reversedNumber);
    }
}

//OUTPUT
// Original number is 123456
// Reved number is 654321
