public class SingleTryWithCatch{
    public static void main(String[] args) {
        try{
            int a=10, b=0 , c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            //System.out.println(e);
            System.out.println("Don't division by zero");
        }
        System.out.println("Bye " );
    }
}
