import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wei
 * @date 2021/4/22 - 17:37
 * @project_name code
 */
public class code4 {
    public static void main(String[] args) {
        int Array_capacity =10;
        //数组扩容
        Scanner in = new Scanner(System.in);
        String[] Expand = new String[Array_capacity];
        String input_char = "";
        int i = 0;

        while (!input_char.equals("q")) {
            System.out.println("输出q退出循环");
            input_char = in.nextLine();
            Expand[i] = input_char;
            i++;
            if (i>20)
                break;      //大于10,，退出循环

            if (getArraysNum(Expand, Expand.length - 1) >= (int) (Expand.length * 0.8)) {
                System.out.println("需要扩容");
                System.out.println("原数组长度=" + Expand.length + " 有效长度=" + getArraysNum(Expand, Expand.length - 1));
                Expand = Arrays.copyOf(Expand, 2 * Expand.length);
                System.out.println("新数组长度=" + Expand.length + " 有效长度=" + getArraysNum(Expand, Expand.length - 1));
            }
        }
    }

    public static int getArraysNum(String[] arr,int n){
        if(n==0){
            return arr[0]==null?0:1;
        }
        return arr[n]==null?getArraysNum(arr, n-1):getArraysNum(arr, n-1)+1;
    }
    /*public static  void main(String[] args){
        int []arr=new int[10];
        arr[1]=5;
        arr[5]=8;
        arr[6]=4;
        int num=getArraysNum(arr,arr.length-1);
        System.out.println(num);
    }*/

}
