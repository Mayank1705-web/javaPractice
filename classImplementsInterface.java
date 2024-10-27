interface First{
    int a = 10;
    void show();
}
interface Second{
    int b = 20; 
    void display();
}
class A implements First, Second {
    public void show(){
        System.out.println("Hello from Show");
    }
    public void display(){
        System.out.println("Hello from Display");
    }
    public void add(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class classImplementsInterface {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
        a1.display();
        a1.add();
    }
}
