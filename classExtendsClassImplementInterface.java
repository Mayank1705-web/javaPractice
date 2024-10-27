interface First{
    void show();
}
interface Second{
    void display();
}
class A{
    void add(){
        System.out.println("Hello from Add"); 
    }
}
class B extends A implements First, Second{
    public void show(){
        System.out.println("Hello from show");
    }
    public void display(){
        System.out.println("Hello from display");
    }
}
class Test{
    public static void main(String[] args){
        B b1 = new B();
        b1.show();
        b1.display();
        b1.add();
    }
}