import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть число Фібоначі");
        Scanner scan = new Scanner(System.in);
        int fibonachi = scan.nextInt();

        ExecutorService executable1 = Executors.newFixedThreadPool(5);
        ExecutorService executable2 = Executors.newCachedThreadPool();
        ExecutorService executable3 = Executors.newSingleThreadExecutor();


        MyThread myThread = new MyThread(fibonachi, 1000);
        myThread.run();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnableThread myRunnable = new RunnableThread(fibonachi, 1000);

    }
}