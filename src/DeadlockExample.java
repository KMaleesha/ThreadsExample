class Resource {
    public void method1(Resource resource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");
        Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

        t1.start();
        t2.start();
    }
}
