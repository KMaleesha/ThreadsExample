public class ConsistencyProblem {
    public static void main(String[] args) {
//        Printer printer = new Printer();
//        PrinterThread printerThread1 = new PrinterThread(printer, "Printer 1");
//        PrinterThread printerThread2 = new PrinterThread(printer, "Printer 2");

        PrinterThread printerThread1 = new PrinterThread("Printer 1");
        PrinterThread printerThread2 = new PrinterThread("Printer 2");

        printerThread1.start();
        printerThread2.start();
    }
}

//synchronized method
//class Printer{
//    public synchronized void print(String name){
//        for(int i=0; i<10; i++){
//            System.out.println(name);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//synchronized block
//class Printer{
//    public void print(String name){
//
//        for(int i=0; i<10; i++){
//            System.out.println("my name is "+name);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        synchronized (this){
//            for(int i=0; i<10; i++){
//                System.out.println(name);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}

//class PrinterThread extends Thread{
//    Printer p;
//    String name;
//
//    public PrinterThread(Printer p, String name){
//        this.p = p;
//        this.name = name;
//    }
//
//    public void run(){
//        this.p.print(name);
//    }
//}

//static synchronized method
class Printer{
    public synchronized static void print(String name){
        for(int i=0; i<10; i++){
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrinterThread extends Thread{
    String name;

    public PrinterThread(String name){
        this.name = name;
    }

    public void run(){
        Printer.print(name);
    }
}
