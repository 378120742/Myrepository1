package 多线程练习.守护线程;
/*
1.守护线程的设置必须要在线程启动之前
2.当所有的非守护线程都执行完毕，只剩下守护线程时，jvm会自动退出
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        System.out.println("main线程开始执行");

        Thread thread = new Thread(myRunnable,"守护线程");

        //设置thread1为守护线程
        thread.setDaemon(true);

        thread.start();

        System.out.println("main线程执行完毕");
    }
}
