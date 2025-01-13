public class Temp {
    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();
        MyThreadA myThreadA = new MyThreadA(printer);
        MyThreadB myThreadB = new MyThreadB(printer);
        MyThreadC myThreadC = new MyThreadC(printer);

        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }
}

class MyPrinter{
    public synchronized  void m1() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" M1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized  void m2(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" M2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void m3(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" M3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThreadA extends Thread{
    MyPrinter myPrinter;

    public MyThreadA(MyPrinter myPrinter){
        this.myPrinter = myPrinter;
    }
    public void run() {
        myPrinter.m1();
    }
}

class MyThreadB extends Thread{
    MyPrinter myPrinter;

    public MyThreadB(MyPrinter myPrinter){
        this.myPrinter = myPrinter;
    }
    public void run() {
        myPrinter.m2();
    }
}

class MyThreadC extends Thread{
    MyPrinter myPrinter;

    public MyThreadC(MyPrinter myPrinter){
        this.myPrinter = myPrinter;
    }
    public void run() {
        myPrinter.m3();
    }
}

