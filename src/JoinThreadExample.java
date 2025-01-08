public class JoinThreadExample {
    public static void main(String[] args) {
        ThreadB thread = new ThreadB();
        thread.start();

        // sleep the main thread for a while
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
    }
}

class ThreadA extends Thread {
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("ThreadA: " + i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        System.out.println("ThreadB: " + Thread.currentThread().getState());

        ThreadA a = new ThreadA();
        a.start();

        try {
            //a.join(5000);
            a.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("ThreadB: " + Thread.currentThread().getState());
        System.out.println("end of thread b");
        System.out.println("ThreadB: " + Thread.currentThread().getState());
        System.out.println("ThreadA: " + a.getState());

    }
}