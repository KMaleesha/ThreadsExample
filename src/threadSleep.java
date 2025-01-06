public class threadSleep {
    public static void main(String[] args) {
        ThreadInterruption thread = new ThreadInterruption();
        thread.start();
    }
}

class ThreadInterruption extends Thread {

    public void run() {
        System.out.println("thread before sleep");

        for(int i = 0; i<10; i++){
           try {
                Thread.sleep(5000);
           }catch(InterruptedException e){
               System.out.println(e);
           }
           System.out.println(i);
        }

        System.out.println("thread after sleep");
    }
}
