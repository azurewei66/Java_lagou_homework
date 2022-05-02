/**
 * @author wei
 * @date 2021/4/22 - 17:36
 * @project_name code
 */
public class code2 {
    public static void main(String[] args) {
        int max = 1000;
        for (int i = 2;i < max; i++){
//            System.out.println("i = " + i);
            int num = 0;
            for (int j = 1; j < i; j++){
                if (i % j == 0){
                    num += j;
//                    System.out.println("i=" + i + " j=" + j + " num=" + num);
                }
            }
            if(num == i)
                System.out.println("完数是" + num);
        }
    }
}
