import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Order(arr,0,arr.length-1);

        for (int s:arr){
            System.out.println(s);
        }

    }
    public static void Order(int[] arr ,int left,int right){
        if(arr!=null&&left<right){
            int basic = arr[left];
            int l = left;
            int r = right;
            while(l!=r){
                while(arr[r]>basic&&l<r){
                    r--;
                }
                while(arr[l]<basic&&l<r){
                    l++;
                }

                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }

            int temp1 = basic;
            basic = arr[l];
            arr[l] = temp1;

            Order(arr,left,l-1);
            Order(arr,l+1,right);
        }

    }
}
