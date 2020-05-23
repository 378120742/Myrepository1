package 多线程练习.join方法使用;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
