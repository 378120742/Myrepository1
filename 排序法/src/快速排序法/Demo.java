package 快速排序法;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arr = new int[10];

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //指定将要排序的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }

        //调用排序
        orderByQuick(arr,0,arr.length-1);

        for (int s: arr){
            System.out.println(s);
        }
    }

    public static void orderByQuick(int[] arr, int left, int right) {
        //判断条件是否正确
        if (arr.length != 0 && (left < right)) {
            int l = left;
            int r = right;
            int center = arr[left];
            while (l != r) {
                while (arr[r] > center && r > l) {
                    r--;
                }
                while (arr[l] < center && l < r) {
                    l++;
                }

                //交换左右指针指向的值
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            int temp = arr[r];
            arr[r] = center;
            center = temp;

            //使用递归继续进行排列
            orderByQuick(arr,0,r-1);
            orderByQuick(arr,r+1,right);
        }

    }
}
