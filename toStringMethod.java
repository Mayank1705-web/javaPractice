public class toStringMethod {
    String message;
    toStringMethod(String str){
        message = str;
    }
    public String toString(){
        return "Message: " + message;
    }
    public static void main(String[] args) {
        toStringMethod t1 = new toStringMethod("Hello");
        toStringMethod t2 = new toStringMethod("Java");   
        System.out.println(t1);
        System.out.println(t2);
    }
}
