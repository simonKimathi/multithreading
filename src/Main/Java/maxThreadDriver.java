package Main.Java;

public class maxThreadDriver {
    public static int max(int[] arr) throws InterruptedException {
        int length = arr.length;
        int max = 0;
        //create new 4 threads
        maxThread[] maxThreads = new maxThread[4];
        for (int i = 0; i < 4; i++) {
            maxThreads[i] = new maxThread((i * length) / 4, (((i + 1) * length) / 4), arr);
            maxThreads[i].start();
        }

        //get final answer
        for (int i=0;i<4;i++){
            maxThreads[i].join();
            if(maxThreads[i].max>max){
                max=maxThreads[i].max;
            }
        }
        return  max;

    }
    public static void main(String[] args) throws InterruptedException{
        int[] arr=new int[]{45,79,45,12,78,56,22,4,20,53,56,32};
        int m= max(arr);
        System.out.println("the maximum value is :"+m);
    }
}
