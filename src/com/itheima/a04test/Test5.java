package com.itheima.a04test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闺年还是平年
            要求：用JDK7和JDK8两种方式判断
            提示：
                二月有29天是闰年
                一年有366天是闰年
         */
        //jdk7
        //简化1：
        //用2月的天数
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);//月份的范围：0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号？
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //用一年的天数
        c.set(2001, 0, 1);
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的年份是365天还是366天
        int day1 = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day1);


        //jdk8
        //月份的范围：1~12
        LocalDate ld = LocalDate.of(2001, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());
    }
}
