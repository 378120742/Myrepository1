package 递归求阶乘;

import java.util.Scanner;

public class JieCheng {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //输入阶乘的上限值
        System.out.println("请输入阶乘的上限值");
        double v = sc.nextDouble();
        System.out.println(v);

        //调用阶乘算法
//        int jc1 = jc(n);
//        System.out.println(jc1);

    }

    public static int jc(int n) {
        if (n==1) {
            return 1;
        }
        else{
            return n*jc(n-1);
        }
    }
}
