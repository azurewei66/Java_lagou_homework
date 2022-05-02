/**
 * @author wei
 * @date 2021/4/22 - 17:37
 * @project_name code
 */
public class code3 {
    public static void main(String[] args) {
        int red_max = 33;
        int blue_max = 16;
        int red_num = 6;
        int blue_num = 1;
        int[] red_result = new int[red_num];
        int blue_result  = 0;
        int[] num = new int[red_max];
        for (int i = 0;i < num.length;i++){
            num[i] = i+1;
        }

//      验证填充数组
//                for (int a:num)
//            System.out.println("num =" + a);

        for(int i = 0;i < red_num;i++) {
            int red_r = (int) (Math.random() * red_max);
//            确保红球号码不重复
            for (int j = 0;j < i;j++)
                while (red_result[j] == num[red_r])
                    red_r = (int) (Math.random() * red_max);
            red_result[i] = num[red_r];
        }
        int blue_r = (int)(Math.random()*blue_max);     //产生篮球号码

        //输出红球号码
        System.out.println("输出红球号码");
        for (int a:red_result)
            System.out.println("红球号码是 = " + a);
        //输出篮球号码
        System.out.println("--------------------------------------");
        System.out.println("输出蓝球号码");
        System.out.println("篮球号码是 = " + blue_r);
    }
}
