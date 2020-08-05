package Main.Java.reverseHello;

public class reverseHelloDriver {
    public static void main(String [] args) throws InterruptedException {
        reverseHello t[]=new reverseHello[50];
        //create the threads
        for(int i=0;i<50;i++)
            t[i]=new reverseHello();
        //wait for each thread
        for(int i=49;i>=0;i--) {
            t[i].start();
            t[i].join();

        }
    }
}
