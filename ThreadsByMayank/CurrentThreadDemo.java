class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("My Thread exiting");

    }
}
