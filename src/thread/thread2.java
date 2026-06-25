package thread;

/*
    TOPIC: Creating Threads using extends Thread

    This example USES Threads.

    What is happening?

    1. Class A extends Thread.
    2. Class B extends Thread.
    3. Both classes override the run() method.
    4. When start() is called, Java creates separate threads.
    5. Both threads run concurrently.

    Execution Flow:

            Main Thread
               |
        -----------------
        |               |
        v               v
      Thread A       Thread B
        |               |
        v               v
      hi hi hi       hello hello hello

    Observation:
    - Output order is NOT guaranteed.
    - Sometimes "hi" appears first.
    - Sometimes "hello" appears first.
    - Both threads are executed independently.

    Difference from previous code:

    WITHOUT THREAD:
        a.show();
        b.show();

        Output:
        hi hi hi...
        hello hello hello...

        (Task B waits for Task A)

    WITH THREAD:
        a.start();
        b.start();

        Output:
        hi
        hello
        hi
        hello
        ...

        (Both tasks can execute concurrently)

    Important:
    start() -> creates a new thread

    run() -> contains the task that thread performs

    Never call run() directly when learning threads.
    Always use start().
*/

class C extends Thread {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class D extends Thread {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

public class thread2 {

    public static void main(String[] args) {

        // Creating Thread Objects
        C c = new C();
        D d = new D();

        /*
            start() creates separate threads.

            Thread c executes run()
            Thread d executes run()

            Both threads may run concurrently.
        */

        c.start();
        d.start();
    }
}