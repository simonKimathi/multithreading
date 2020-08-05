package Main.Java;

public class reverseThread extends Thread {
    String reverse;
    String rev="";

    public reverseThread(String reverse) {
        this.reverse = reverse;
    }

    @Override
    public void run() {
        for(int i = reverse.length() - 1; i >= 0; i--)
        {
            rev = rev + reverse.charAt(i);
        }
        System.out.println(rev);
    }
}
