package 河内塔;

import java.util.Scanner;

public class hanit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //请输入河内塔的盘数
        int n = sc.nextInt();

        // 调用河内塔开始工作
        honit(n,'a','b','c');
    }

    public static void honit(int n,char a,char b,char c){
       if(n==1){
           System.out.println("将第1个盘子由"+a+"移动到"+c);
       }
       else{
           //将n-1个盘子由a移动到b,借助c
           honit(n-1,a,c,b);
           //将第n个盘子移动到c上
           System.out.println("将第"+n+"个盘子从"+a+"移动到"+c);
           //再把n-1个盘子由b移动到c,借助a
           honit(n-1,b,a,c);
       }
    }
}
