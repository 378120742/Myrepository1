package 选择排序法;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //动态初始化一个长度为10的数组
        int arr[] = new int[10];      //1

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);      //1

        //给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");  // n
            arr[i] = sc.nextInt();                         // n
        }

        //使用选择排序法进行排序
        for (int i = 0; i < arr.length - 1; i++) {     //n-1
            //定义一个临时变量存储最小元素的index
            int min = i;                           // n-1
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //定义一个临时变量
            int tem = 0;
            //如果满足这个条件，说明第一个不是最小的元素
            if (min != i) {
                tem = arr[min];
                arr[min] = arr[i];
                arr[i] = tem;
            }
        }

        //遍历排序好的元素
        for (int s : arr) {
            System.out.println(s);
        }
    }
}
