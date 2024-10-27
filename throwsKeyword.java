public class throwsKeyword {
    void div (int a, int b) throws ArithmeticException{
        int c; 
        if (b == 1) {
            throw new ArithmeticException("/by 1");
        }
        else{
            c = a/b;
            System.out.println (c);
        }
    }
    public static void main(String[] args) {
        throwsKeyword t1 = new throwsKeyword();
        try {
            t1.div(10, 1);
            t1.div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
