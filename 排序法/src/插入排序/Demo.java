package 插入排序;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //动态初始化一个长度为10的数组
        int arr[] = new int[10];

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //给数组元素赋值
        for (int i = 0; i <arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            arr[i]=sc.nextInt();
        }

        //使用插入排序进行排序
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(arr[j-1]>temp&&j>=1){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        //遍历
        for(int s:arr){
            System.out.println(s);
        }
    }
}
