public class p71 {
    public static void main(String[] args) {
        System.out.println("Program started.");

        try {
            // Sleeping for 3 seconds
            System.out.println("Main thread sleeping for 3 seconds...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Program resumed after sleep.");

        // Sleeping for another 2 seconds
        try {
            System.out.println("Main thread sleeping for another 2 seconds...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Program completed.");
    }
}
