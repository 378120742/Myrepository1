package 冒泡排序法;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //动态初始化一个长度为10的
        int[] arr = new int[10];     //1

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);    //1
        
        //给数组赋值
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个数");    //  n
            arr[i]=sc.nextInt();                         //    n
        }
        
        //使用冒泡算法排序(升序排列)
        for (int i = 0; i <arr.length-1; i++) {        //  n
            for (int j = 0; j <arr.length-1-i; j++) {
                //定义一个临时变量                      //n-1 n-2 .......1
                int tem = 0;
                if(arr[j]>arr[j+1])
                {
                    tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }

        //遍历排序完成的数组元素
        for(int s:arr){
            System.out.println(s);
        }
    }
}
