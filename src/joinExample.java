public class joinExample {
    public static void main(String[] args) {
        MyJoinThread myJoinThread = new MyJoinThread();
        myJoinThread.start();

        System.out.println("Start of the main thread");

        // when joining we have to wait until the task is end. so we are interrupting to the thread. so we should handle it
        try{
            //myJoinThread.join(); // util my join thread is end
            myJoinThread.join(5000); // only wait for 5 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myJoinThread.getState());
        System.out.println("main end");
    }
}

class MyJoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(getState());
    }
}
