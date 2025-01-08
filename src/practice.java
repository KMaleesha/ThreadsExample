import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) throws InterruptedException {
         int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

//         Thread1 thread1 = new Thread1(0,3, arr);
//         Thread1 thread2 = new Thread1(4,7, arr);
//         Thread1 thread3 = new Thread1(8,11, arr);
//         Thread1 thread4 = new Thread1(12,15, arr);
//
//         thread1.start();
//         thread2.start();
//         thread3.start();
//         thread4.start();
//
//         thread1.join();
//         thread2.join();
//         thread3.join();
//         thread4.join();
//
//         int total = thread1.sum + thread2.sum + thread3.sum + thread4.sum;
//         System.out.println(total);

        List<Thread2> threads = new ArrayList<>();
        threads.add(new Thread2(0,3,arr));
        threads.add(new Thread2(4,7, arr));
        threads.add(new Thread2(8,11,arr));
        threads.add(new Thread2(12,15,arr));

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        int Total = 0;
        for (Thread2 thread1 : threads) {
            Total = Total + thread1.sum;
        }
        System.out.println(Total);
    }
}

class Thread1 extends Thread {
    int sum;
    int start;
    int end;
    int arr[];

    public Thread1( int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            this.sum += arr[i];
        }
    }
}

