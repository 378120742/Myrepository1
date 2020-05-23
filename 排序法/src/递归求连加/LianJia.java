package 递归求连加;

import java.util.Scanner;

public class LianJia {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //输入阶乘的上限值
        System.out.println("请输入连加的上限值");
        int n = sc.nextInt();

        //调用阶乘算法
        int i = lJ(n);
        System.out.println(i);
    }

    public static int lJ(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + lJ(n-1);
        }
    }
}
