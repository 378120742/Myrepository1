package 河内塔;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入盘子的个数");
        int disk = sc.nextInt();
        hannoi(disk,'a','b','c');
    }
    public static void move(int disk, char M, char N ){
        System.out.println("将第"+disk+"个盘子"+M+"------>"+N);
    }


    public static void hannoi(int n, char A, char B, char C){
        if(n == 1){
            move(n, A, C);
        }else{
            //移动上一关的步骤移动到B
            hannoi(n - 1, A, C, B);
            //把最大的盘子移动C塔
            move(n, A, C);
            //再把B上的上一关的盘子移动到C上就可以了
            hannoi(n - 1, B, A, C);

        }
    }
}
