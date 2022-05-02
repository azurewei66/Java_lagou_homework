package com.lottery_draw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wei
 * @date 2021/4/21 - 17:11
 * @project_name code1
 */
public class lottery_draw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("抽奖最大数是多少");
        int m = in.nextInt();

        System.out.println("抽奖抽几位");
        int n = in.nextInt();

        int[] number = new int[m];
        for(int i=0 ; i<number.length ; i++)
            number[i] = i+1;

        int[] result = new int[n];
        for (int i = 0;i < result.length;i++){
            //产生随机数
            int r = (int)(Math.random()*m);
            result[i] = number[r];
//            避免产生重复的数字
            number[r] = number[n - 1];
            n--;
        }

        //未排序
        System.out.println("未排序");
        for (int b:result)
            System.out.println(b);
        Arrays.sort(result);
        System.out.println("已排序");
        for (int b:result)
            System.out.println(b);

    }
}
