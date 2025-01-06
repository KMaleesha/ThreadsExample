public class setThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new myThread(), "My Thread 1");
        //thread.setName("My Thread 2");
        thread.start();
        System.out.println(thread.getName());
    }
}

class myThread implements Runnable{
    public void run() {
        //System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
           try{
               Thread.sleep(500);
           } catch(InterruptedException e){
               System.out.println(e);
           }
        }
    }
}
