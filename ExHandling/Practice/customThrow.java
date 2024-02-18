class MyException extends Throwable{
    private int value;
    public MyException(int data){
        this.value=data;
    }
    public String toString(){
        return "value of a is "+this.value;
    }
}
public class customThrow{
    static void check(int value) throws MyException{
        if(value>10){
            throw new MyException(value);
        }else{
            System.out.println("Normal exit!");
        }
    }
    public static void main(String[] args){
        try{
            check(1);
            check(100);
        }catch(MyException e){
            System.out.println("Caugth : "+e.getMessage());
        }
    }
}