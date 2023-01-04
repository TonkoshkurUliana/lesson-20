public class RunnableThread implements Runnable {
    private int fibonachi;
    private int delay;
    private Thread thread;

    public RunnableThread(int fibonachi, int delay) {
        this.fibonachi = fibonachi;
        this.delay = delay;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int[] mas = new int[fibonachi + 1];
        mas[1] = 1;
        mas[2] = 1;
        int n2;

        System.out.println();
        System.out.print("Потік Runnable: " );
        for (int i = 3; i < fibonachi; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }
        for (int i = mas.length - 2; i >= 0; i--) {
            System.out.print(mas[i] + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

