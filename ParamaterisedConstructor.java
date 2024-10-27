class A{
    A(int i, int j){
        System.out.println("A constructor called");
        System.out.println("i = " + i + ", j = " + j);
    }
}
class B extends A{
    B (int i, int j){
        super(i, j);
        System.out.println("B constructor called");
    }
}
class Test{
    public static void main(String[] args){
       A a1 = new A(10,20)
        B b = new B(100, 200);
    }
}