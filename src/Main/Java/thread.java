package Main.Java;
import java.lang.Thread;

public class thread extends Thread {
    public void run() {
        for (int i=0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"thread running through extend");
        }
    }
}
