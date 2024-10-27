public class SingleTryWithMultipleCatch {
    public static void main(String[] args) {    
        int a=10 , b=10 , c , d[] = {10,20,30};
        try {   
            c=a/b;
            System.out.println (c);
            System.out.println(d[3]);
        }
        catch(ArithmeticException e){
            //System.out.println(e);
            System.out.println("Don't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e);
            System.out.println("Array index out of bound");
        }
    }
}