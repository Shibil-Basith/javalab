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


class p72
{
    public static void main(String args[])
    {
        MyThread childThread = new MyThread();
        childThread.setName("Child Thread");
        childThread.start();


        for(int i=0; i<10; i++)
        {
            System.out.println("Main Thread : " + i);

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Main Thread interrupted.");
            }

            if(i==6)
            {
                try
                {
                    childThread.join();
                }
                catch(InterruptedException e)
                {
                    System.out.println("Main Thread interrupted while waiting for Child Thread.");
                }
            }
        }

        System.out.println("Main Thread completed.");
    }
}