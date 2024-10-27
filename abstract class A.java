abstract class A{
    abstract void show();
    void display(){
        System.out.println("Hello from A");
    }
}
class B extends A{
    void show(){
        System.out.println("Hello from B show");
    }
}
class AbstractClassA{
    public static void main(String[] args){
        B b1 = new B();
        b1.show();
        b1.display();
    }
}