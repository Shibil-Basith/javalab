import java.util.Scanner;

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class p73
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of threads: ");
        int numThreads = input.nextInt();

        MyRunnable r = new MyRunnable();
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) 
        {
            threads[i] = new Thread(r);
            threads[i].setName("Thread " + (i + 1));
            threads[i].start();
        }
    }
}

