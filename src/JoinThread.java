public class JoinThread {
    public static void main(String[] args) {
         MyThread myThread = new MyThread();
         myThread.start();

         try{
             myThread.join();
         }catch(InterruptedException e){
             e.printStackTrace();
         }

         System.out.println(myThread.getState());
         System.out.println("My thread completed.");
    }

    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i<10; i++){
                System.out.println(i);
            }
        }
    }
}


