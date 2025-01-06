//how to get thread name using this.getName
public class getThreadName {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        //myThread1.setName("MyThread1");
        myThread1.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        this.setName("MyThread2");
        System.out.println(this.getName());
    }
}