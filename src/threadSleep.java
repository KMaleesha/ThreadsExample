public class threadSleep {
    public static void main(String[] args) throws InterruptedException {
        ThreadInterruption thread = new ThreadInterruption();
        thread.start();

        System.out.println(thread.getState());
        Thread.sleep(1000);

        thread.interrupt();
        System.out.println(thread.getState());
    }
}

class ThreadInterruption extends Thread {

    public void run() {
        System.out.println("thread before sleep");

        for(int i = 0; i<10; i++){
           try {
                Thread.sleep(5000);
           }catch(InterruptedException e){
               System.out.println("thread interrupted");
                System.out.println(Thread.currentThread().getState());
           }
           System.out.println(i);
        }

        System.out.println("thread after sleep");
    }
}
