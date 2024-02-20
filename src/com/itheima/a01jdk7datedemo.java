package com.itheima;

import java.util.Date;

public class a01jdk7datedemo {
    public static void main(String[] args) {
        /*
            public Date()                           创建Date对象，表示当前时间
            public Date(long date)                  创建Date对象，表示指定时间
            public void setTime(long time)          设置/修改毫秒值
            public long getTime()                   获取时间对象的毫秒值
         */
        //1.创建对象表示一个时间
        Date d1 = new Date();
        System.out.println(d1);

        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3.setTime 修改时间
        //1000ms = 1s
        d2.setTime(1000L);
        System.out.println(d2);

        //4.getTime获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);


    }
}
