package Main.Java.reverseHello;

class reverseHello extends Thread{
    public void run()
    {
        for(int j=49;j>=0;j--)
            System.out.println("Hello from Thread <"+(j+1)+">");
    }
}

