import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class multithreadedRandom {
    public static void main(String[] args) throws InterruptedException {

        int n = 100000000;
        int arr[] = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }

        List<Thread3> threads = new ArrayList<>();
        threads.add(new Thread3(0,(int) n/4,arr));
        threads.add(new Thread3(((int)n/4)+1,(int)n/2, arr));
        threads.add(new Thread3(((int)n/2)+1,(int)3*n/4,arr));
        threads.add(new Thread3((int)3*n/4,n-1,arr));

        long start =  System.currentTimeMillis();

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }

        int Total = 0;
        for (Thread3 thread3 : threads) {
            Total = Total + thread3.sum;
        }
        System.out.println(Total);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class Thread3 extends Thread {
    int sum;
    int start;
    int end;
    int arr[];

    public Thread3( int start, int end, int[] arr) {
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
