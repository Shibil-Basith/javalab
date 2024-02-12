class MyThread extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
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


class p69
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}