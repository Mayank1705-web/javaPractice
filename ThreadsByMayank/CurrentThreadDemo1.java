public class CurrentThreadDemo1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        System.out.println("After the change of the current thread");
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        System.out.println("Priority : "+ t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("After Priority Change : "+ t.getPriority());
        System.out.println("name : "+ t.getName());
        System.out.println("is alive: "+t.isAlive());
        try {
            for (int i = 0 ; i <= 5 ; i++) {
                System.out.println("Thread Program "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
