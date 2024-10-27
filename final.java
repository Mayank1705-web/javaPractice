class A{
    final void show(){
        System.out.println("This is from class A");
    }
}
class B extends A{
    void show(){
        System.out.println("This is from class B");
    }
}
public class finalK {
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        a1.show();
        b1.show(); 
    }
}
