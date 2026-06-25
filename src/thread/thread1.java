package thread;

/*
    TOPIC: Threading in Java

    This example DOES NOT use Threads.

    What is happening?

    1. The program starts with only one thread called Main Thread.
    2. Main Thread calls a.show().
    3. Main Thread prints "hi" 11 times.
    4. After a.show() finishes, Main Thread calls b.show().
    5. Then it prints "hello" 11 times.

    Execution Flow:

        Main Thread
            |
            v
        a.show()
            |
            v
      hi hi hi hi hi...
            |
            v
        b.show()
            |
            v
      hello hello hello...

    Observation:
    - Tasks are executed one after another.
    - There is no parallel execution.
    - This is called Single Threaded Execution.

    Output:

    hi
    hi
    hi
    ...
    hello
    hello
    hello

    Why learn this?
    Before learning Threads, we must understand the problem.
    Here task B waits for task A to finish.
    Threads solve this problem by allowing multiple tasks to run concurrently.
*/

class A {
    public void show(){
        for (int i=0; i<=10; i++){
            System.out.println("hi");
        }
    }
}


class B {
    public void show(){
        for (int i=0; i<=10; i++){
            System.out.println("hhello");
        }
    }
}

public class thread1 {

    static void main() {
        A a = new A();
        B b = new B();

        a.show();
        b.show();
    }
}


