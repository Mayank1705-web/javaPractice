public class MultipleTryCatch {
    public static void main(String[] args) {
        int a = 10 , b = 0 , c , d[] = {10,20,30};
        String name = "Hello";
        try {
            c=a/b;
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
        try {
            System.out.println(d[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        try {
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds");
        }
        System.out.println("Bye");
    }
}
