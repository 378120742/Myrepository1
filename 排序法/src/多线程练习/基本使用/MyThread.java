package 多线程练习.基本使用;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name+"正在出售第"+i+"张票");
        }
    }

}
