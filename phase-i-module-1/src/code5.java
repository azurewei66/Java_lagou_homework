/**
 * @author wei
 * @date 2021/4/22 - 17:37
 * @project_name code
 */
public class code5 {
    public static void main(String[] args) {
        int row = 16;
        int column = 16;
        int[] wuziqi_row_num = new int[row];
        int[] wuziqi_column_num = new int[column];
        char[][] wuziqi = new char[row][column];

        for (int i = 0; i < wuziqi_row_num.length; i++) {
            wuziqi_column_num[i] = i;
            wuziqi_row_num[i] = i;
        }

        //利用System.out.println()打印十六进制
//        Integer.toHexString(int a)讲a转化为十六进制数
        for (int i = 0;i<wuziqi.length;i++){
            for (int j = 0;j < wuziqi[i].length;j++)
                wuziqi[i][j] = '+';
        }

        System.out.println("--------------------------------------------------------------------");
        for (int a:wuziqi_column_num)
            System.out.printf("\t%x",a);
        System.out.println();

        for (int i = 0;i < wuziqi_column_num.length;i++){
            String str_wuziqi = "";
            for (int j = 0;j < wuziqi[i].length;j++){
                str_wuziqi = "\t" + wuziqi[i][j] + str_wuziqi;
            }
            System.out.println(Integer.toHexString(wuziqi_column_num[i]) + str_wuziqi);
        }
    }
}
