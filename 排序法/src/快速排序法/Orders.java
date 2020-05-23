package 快速排序法;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //动态初始化一个长度为10的数组
        int[] arr = new int[10];

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }

        orderByQuick(arr, 0, arr.length - 1);
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void orderByQuick(int[] arr, int left, int right) {
        //校验输入的条件
        if (arr.length != 0 && (left < right)) {
            int center = arr[left];
            int l = left;
            int r = right;
            while (l != r) {
                while (arr[r] > center && r > l) {
                    r--;
                }
                while (arr[l] < center && l < r) {
                    l++;
                }
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }

            //跳出此循环说明左右两指针相遇，此时交换中心轴的值
            int temp = arr[l];
            arr[l] = center;
            center = temp;

            //递归核心
            orderByQuick(arr, left, l - 1);
            orderByQuick(arr, l + 1, right);
        }


    }
}
