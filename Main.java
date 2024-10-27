public class Main{
    public static class OddThreads extends Thread{
        public void run(){
            int f = 1;
            for(int i = 1; i <= 20; i++){
                if (i%2 != 0){
                try{
                    System.out.println(i);
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println ("Exception Handleled");
                }
                
                }
            }
        }
    }
    public static class EvenThreads extends Thread{
        public void run(){
            int f = 1;
            for(int i = 1; i <= 20; i++){
                if (i%2 == 0){
                try{
                    EvenThreads.join();
                    System.out.println(i);
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println ("Exception Handleled");
                }
                }
            }
        }
    }
    public static void main(String[] args) {
        OddThreads t1 = new OddThreads();
        EvenThreads t2 = new EvenThreads();
        t1.start();
        t2.start();
    }
}