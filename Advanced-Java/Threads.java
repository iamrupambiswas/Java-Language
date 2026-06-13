public class Threads {
    public static void main(String[] args) {
        MyFirstThread thread = new MyFirstThread();
        thread.start();
    }
}

class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyThread!");
    }
}