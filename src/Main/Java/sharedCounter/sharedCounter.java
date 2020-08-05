package Main.Java.sharedCounter;

import Main.Java.Main;

public class sharedCounter extends Thread {

    int counter=0;
    public sharedCounter(int counter) {
        this.counter = counter;
    }

    public sharedCounter() {

    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            counter++;
        }
        System.out.println(counter);
    }
}
