class SharedResource {
    public synchronized void printMessage(String message) {
        System.out.println("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

public class ThreadLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printMessage("Hello"));
        Thread t2 = new Thread(() -> resource.printMessage("World"));

        t1.start();
        t2.start();
    }
}
