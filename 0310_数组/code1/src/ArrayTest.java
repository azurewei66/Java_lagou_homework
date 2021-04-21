import java.util.Arrays;

/**
 * @author wei
 * @date 2021/4/21 - 16:01
 * @project_name code1
 */
public class ArrayTest {
    public static void main(String[] args) {
        //第一中方法声明初始化数组
//        int[] a = new int[10];
        int[] a = {0,1,2,3,4,5,6,7,8,9,};
        for (int i = 0;i < a.length;i++){
            System.out.println("a[" + i +"]=" + a[i]);
        }
        System.out.println("数组a length = " + a.length);

        //第二种方法声明初始化数组
        String[] name = {"alan","Bob","Charli","David"};
        for (String b : name)
            System.out.println("the author name is " + b);

        //拷贝数组,相当于指针赋值.两个变量同时引用一个数组
        int[] a_back = a;
        for (int b :a_back)
            System.out.println("a_back is " + b);

        //数组拷贝 Arrays.copyof()
        int[] a_backs = Arrays.copyOf(a,a.length * 2);
        for (int i = 0;i < a_backs.length; i++)
            System.out.println("a-backs[" + i + "]= " + a_backs[i]);
     }
}
