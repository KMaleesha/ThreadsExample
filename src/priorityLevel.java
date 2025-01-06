public class priorityLevel {
    public static void main(String[] args) {

        //Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        
        Thread thread = new Thread();
        //thread.setPriority(Thread.MAX_PRIORITY);
        //thread.setPriority(Thread.MIN_PRIORITY);
        //thread.setPriority(Thread.NORM_PRIORITY);
        //System.out.println(Thread.currentThread().getPriority());
        System.out.println(thread.getPriority());
    }
}

class MyThread extends Thread {
    public void run() {
    }
}
