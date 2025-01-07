public class SleepThread {
    public static void main(String[] args) {
        SleepThreadInterruption thread = new SleepThreadInterruption();
        thread.start();
        System.out.println("Before Interrupt");
        thread.interrupt();
        System.out.println(thread.getState());
        System.out.println("After Interrupt");
    }
}

class SleepThreadInterruption extends Thread{
    public void run(){

        long startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() < startTime + 5000){
            //System.out.println(Thread.currentThread().getName());
        }

        System.out.println("After 5 Seconds");

        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getState());
        }catch (InterruptedException e){
            System.out.println("Sleep interrupted");
        }

//        for(int i=0; i<10; i++){
//            try {
//                Thread.sleep(2000);
//                System.out.println(i);
//                System.out.println(Thread.currentThread().getState());
//            }catch (InterruptedException e){
//                System.out.println("Sleep interrupted");
//            }
//        }
    }
}
