package Main.Java;

public class ReverseThreadDriver {
    public  static  void reverse(String  reverse) throws InterruptedException {
        int len=reverse.length();
        String rev="";
        //create threads
        reverseThread[] reverseThreads=new reverseThread[50];
        for (int i = 0; i < 50; i++) {
            reverseThreads[i]=new reverseThread(reverse);
            reverseThreads[i].start();
            reverse(reverse);
        }

        //wait for the threads to finish
        for (int i = 0; i < 50; i++) {
            reverseThreads[i].join();
            reverseThreads[i]=new reverseThread(reverse);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        reverse("hello");
    }
}
