interface First{
    void show();
}
class A implements First{
    public void show(){
        System.out.println("Hello from A");
    }
}
public class interfaceTest {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
    }
}

