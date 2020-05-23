package 多线程练习.基本使用;

import 多线程练习.基本使用.MyThread;

public class TicketDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();  //创建共享资源的对象
        myThread1.setName("一号窗口");

        MyThread myThread2 = new MyThread();
        myThread2.setName("二号窗口");

        myThread1.start(); //启动线程1
        myThread2.start(); //启动线程2



    }
}
