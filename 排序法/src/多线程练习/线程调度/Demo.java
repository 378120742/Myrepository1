package 多线程练习.线程调度;

public class Demo {
    public static void main(String[] args) throws Exception{
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"一号线程");

        Thread thread2 = new Thread(myRunnable,"二号线程");
    }
}
