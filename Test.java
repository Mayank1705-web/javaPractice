class test extends Thread 
{ 
    public void run() 
    {
        System.out.println(“Run”);
    }
} 
Class myclass{ 
public static void main(String args[]) 
    { 
    test t=new test(); 
    t.start(); 
    System.out.println(“Main”); 
    }   
    
}