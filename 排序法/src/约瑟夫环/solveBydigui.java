package 约瑟夫环;

import java.util.Scanner;

public class solveBydigui {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //请输入人数n 和 出列数m
        System.out.println("请输入人数");
        int n = sc.nextInt();
        System.out.println("请输入出列数");
        int m = sc.nextInt();
        select(n, m);

    }

    public static void select(int n, int m) {
        if (n != 0 && m != 0) {
            //定义一个初始化变量，存储胜利者的位置,初始值为一个人时胜利者的位置
            int init = 0;
            //定义一个循环变量
            int i = 2;
            while (i <=n) {
                init = (init + m) %( i);
                i++;

            }
            System.out.println(init);
        }
    }
}
