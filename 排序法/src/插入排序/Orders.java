package 插入排序;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arr = new int[2];

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //给要排序的元素赋值
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i] = sc.nextInt();
        }

        //插入排序算法
        //默认第一个数是最小的，将其归为已排序的一组
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  //将未排序的第一个元素存在一个临时变量中，方便之后插入
            int j = i;  //定义一个临时变量，存储未排序的第一个元素的索引
           while(arr[j-1]>temp&&j>=1){  //j>=1：如果未排序的元素跑到索引为0的地方，说明已经是最小了，此时不满足循环条件直接跳出
               arr[j] = arr[j-1];
               j--;
           }
           arr[j] = temp;
        }

        for(int s:arr){
            System.out.println(s);
        }
    }
}
