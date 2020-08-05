package Main.Java;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        thread thread1=new thread();
       // thread1.start();
        threadRunnable threadRunnable=new threadRunnable();
        Thread thread=new Thread(threadRunnable);
       // thread.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread1.join();
        thread.start();
        thread.join();
        /*//sleep mode
        sleepThread sleepThread=new sleepThread();
        sleepThread sleepThread1= new sleepThread();
        sleepThread sleepThread2= new sleepThread();
        sleepThread.start();
        sleepThread1.start();
       // sleepThread.start(); you cant thread twice
        sleepThread.run();
        sleepThread1.run();
        sleepThread1.run();
        //join method
        sleepThread.start();
        try {
            sleepThread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepThread1.start();
        sleepThread2.start();
        System.out.println("name of thread 1:"+thread.getName());
        System.out.println("name of thread 1:"+thread1.getName());
        System.out.println("name of thread 1:"+sleepThread.getName());
        System.out.println("name of thread 1:"+sleepThread1.getName());
        System.out.println("name of thread 1:"+sleepThread2.getName());*/

        //thread.setName("simon thread");
        System.out.println("hey");
        System.out.println("new name is "+Thread.currentThread().getName());



    }
}
