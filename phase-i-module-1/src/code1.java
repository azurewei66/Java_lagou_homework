import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author wei
 * @date 2021/4/22 - 11:39
 * @project_name code
 */
public class code1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        System.out.println("请输入年(1050-2050)");
        year = in.nextInt();
        //        判断年输入是否有效
        while (year >= 2050 || year <=  1050){
            System.out.println("重新输入年(1050-2050)");
            year = in.nextInt();
        }
        System.out.println("请输入月");
        month = in.nextInt();
        //        判断月输入是否有效
        while (month < 1 || month > 12) {
            System.out.println("重新输入月");
            month = in.nextInt();
        }
        System.out.println("请输入日");
        day = in.nextInt();
        //        判断日输入是否有效
        switch (month){
            case 2:
                while (day < 1 || day > 29) {
                    System.out.println("这是二月份，请重新输入日");
                    day = in.nextInt();
                    break;
                }
            default:
                while (day <1 || day > 31) {
                    System.out.println("请重新输入日");
                    day = in.nextInt();
                    break;
                }
        }
        LocalDate inputDay = LocalDate.of(year,month,day);
        int days = inputDay.getDayOfYear();
        System.out.println("这一天是这一年的第" + days + "天");
    }
}
