package Main.Java;

public class threadRunnable implements Runnable {
    public void run() {
        for (int i=0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"Threading running by implementing runnable");
        }
    }
}
