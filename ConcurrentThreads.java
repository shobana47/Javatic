import java.util.*;

class NumberPrint extends Thread 
{
    private String threadName;

    public NumberPrint(String name) {
        this.threadName = name;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ConcurrentThreads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name for first thread: ");
        String firstThreadName = input.nextLine();

        System.out.print("Enter name for second thread: ");
        String secondThreadName = input.nextLine();

        NumberPrint thread1 = new NumberPrint(firstThreadName);
        NumberPrint thread2 = new NumberPrint(secondThreadName);

        thread1.start();
        thread2.start();
    }
}
