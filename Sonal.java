public class MayankException extends Exception{
    String message;
    MayankException(String str) {
        message = str;
    }
    public String toString() {
        return ("Mayank Exception:"+message);
    }
}
public class Sonal{
    public static void main(String[] args) {
        int a = 10, b = 1;
        try {
            if (b == 1) {
                throw new MayankException("/by one");
            } else {
                int c = a / b;
                System.out.println(c);
            }
        } catch (MayankException e) {
            System.out.println(e);
        }
        System.out.println("Bye");
    }

}