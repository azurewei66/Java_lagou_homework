package com.calendar_demo.java;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author wei
 * @date 2021/4/11 - 17:12
 */
public class calendar_demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int mouth = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1 );
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        String print_date = "today is :"+ year + "," + mouth + "," + today;
        System.out.println(print_date);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i < value;i++)
            System.out.print("    ");
        while (date.getMonthValue() == mouth){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.printf("*");
            else
                System.out.printf(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
//        System.out.printf("%d",value);
    }
}
