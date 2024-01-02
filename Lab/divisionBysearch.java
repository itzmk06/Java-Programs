import java.util.*;
public class divisionBysearch {
    public static  int findIntPart(int dividend,int divisor){
        int beg=0,end=dividend-1,target=dividend,ans=-1;
        while(beg<=end){
            int mid=beg+(end-beg);
            if(divisor*mid<=dividend){
                beg=mid+1;
                ans=mid;
                break;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static double findFloatPart(int dividend,int divisor,int ans){
        double final_ans=-1;
        double step=0.1;
        for(int i=0;i<4;i++){
            for(double j=ans;j*divisor<=dividend;j+=step){
                final_ans=ans;
            }
            step/=10;
        }
        return final_ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dividend:");
        int dividend=sc.nextInt();
        System.out.print("Enter divisor:");
        int divisor=sc.nextInt();
        int part=findIntPart(dividend,divisor);
        System.out.println("The integer part is "+part);
        double floatingNum=findFloatPart(dividend,divisor,part);
        System.out.println("The number with floating point is "+floatingNum);
    }
}
