package demo;

public class demo implements Runnable {

    @Override
    public void run() {
        System.out.println("Đây là luồng 1");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new demo(),"Luồng 1");
        MyThread myThread = new MyThread();
        Thread thread2 = new Thread(myThread);

        thread1.start();
        System.out.println(thread1.getName());
        thread2.start();
        System.out.println(thread2.getName());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Đây là luồng 2");
    }
}
