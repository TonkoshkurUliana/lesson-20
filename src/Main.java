import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть число Фібоначі");
        Scanner scan = new Scanner(System.in);
        int fibonachi = scan.nextInt();

        MyThread myThread = new MyThread(fibonachi, 1000);
        myThread.run();
        RunnableThread myRunnable = new RunnableThread(fibonachi, 1000);

    }
}