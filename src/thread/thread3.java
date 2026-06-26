package thread;

/*
    Creating Threads using Runnable Interface

    Why Runnable?

    - Java allows only single inheritance.
    - If a class already extends another class,
      we can still create threads using Runnable.
    - Preferred approach in real projects.
*/

class E implements Runnable {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class F implements Runnable {

    public void run() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

public class thread3 {

    public static void main(String[] args) {

        E obj1 = new E();
        F obj2 = new F();

        // Creating Thread objects using Runnable references

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Starting both threads

        t1.start();
        t2.start();
    }
}