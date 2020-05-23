package 约瑟夫环;

import java.util.LinkedList;
import java.util.Scanner;

public class SolveByMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入人数n和出列数m
        System.out.println("请输入人数");
        int n = sc.nextInt();
        System.out.println("请输入出列数");
        int m = sc.nextInt();

        //调用算法求解最后剩余的学生数
        selectStudent(n,m);
    }

    public static void selectStudent(int n,int m){
        if(n==0||m==0){
            System.out.println("条件有误，请重新输入");
        }
        else{
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            for (int i = 1; i <= n; i++) {
                linkedList.add(i);
            }
            //设置出列学生的索引
            int removeIndex = 1;
            while(linkedList.size()!=1){
                removeIndex = (removeIndex+m)%linkedList.size();
                linkedList.remove(removeIndex);
            }
            System.out.println(linkedList.getFirst());
        }
    }
}
