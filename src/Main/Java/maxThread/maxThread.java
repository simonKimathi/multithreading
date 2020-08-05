package Main.Java.maxThread;

import Main.Java.Main;

public class maxThread extends Thread{
    int low,high;
    int []arr;
    int max=0;

    public maxThread(int low, int high, int[] arr) {
        this.low = low;
        this.high = high;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i=low;i<high;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }
}
