package Main.Java.sharedCounter;

public class sharedCounterDriver {
    public static void main(String[]args) throws InterruptedException {
        int count=0;
        sharedCounter[] sharedCounters=new sharedCounter[10];
        //initialize the threads
        for (int i=0;i<10;i++){
            sharedCounters[i]=new sharedCounter();
            sharedCounters[i].start();
        }

        for (int i=0;i<10;i++) {
            sharedCounters[i].join();
            count=count+sharedCounters[1].counter;
        }
        System.out.println(count);

    }
}
