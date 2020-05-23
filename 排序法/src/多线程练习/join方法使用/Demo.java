package 多线程练习.join方法使用;
/*

 */
public class Demo {
    public static void main(String[] args)  {
        System.out.println("main start");
        MyRunnable myRunnable = new MyRunnable();
        //创建一个线程
        Thread thread = new Thread(myRunnable,"线程1");

        thread.start();

        try {
            thread.join();  //等待指定时间之后再执行join方法后面的代码，如果不指定时间，默认thread执行完
            if(thread.isAlive()){
                System.out.println("thread not finished");
            }
            else{
                System.out.println("thread has finished");
            }
            System.out.println("main has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
