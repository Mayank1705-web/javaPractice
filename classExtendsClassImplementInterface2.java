interface First{
    void display();
}

interface Second{
    void show();
}

class A implements First, Second {
    public void display() {
        System.out.println("Hello from display");
    }
    
    public void show() {
        System.out.println("Hello from show");
    }
}

public class classExtendsClassImplementInterface2 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        a.show();
    }    
}
