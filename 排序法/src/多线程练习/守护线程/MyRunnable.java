package 多线程练习.守护线程;

public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"begin");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
