public class MyThread extends Thread {
    private int fibonachi;
    private int delay;

    public MyThread(int fibonachi, int delay) {
        this.fibonachi = fibonachi;
        this.delay = delay;
    }

    @Override
    public synchronized void run() {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.println();
        System.out.print("Потік Thread: " + n0 + " " + n1 + " ");
        for (int i = 3; i <= fibonachi; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
