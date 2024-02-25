package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        /*
            public static Calendar getInstance()        获取当前时间的日历对象

            public final Date getTime()                 获取日期对象
            public final setTime(Date date)             给日历设置日期对象

            public long getTimeInMillis()               拿到时间毫秒值
            public void setTimeInMillis(long millis)    给日历设置时间毫秒值

            public int get(int field)                   取日历中的某个字段信息
            public void set(int field, int value)       修改日历的某个字段信息
            public void add(int field, int amount)      为某个字段增加/减少指定的值
         */

        //1.获取日历对象
        //细节：Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //底层原理：
        //会根据系统的不同时区来获取不同的日历对象
        //会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);

        System.out.println(c);



    }
}
