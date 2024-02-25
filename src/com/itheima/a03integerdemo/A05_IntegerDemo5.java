package com.itheima.a03integerdemo;

import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入一个整数");
        int i = sc.nextInt();
        System.out.println(i);*/

        String line = sc.nextLine();//输入2.3
        System.out.println(line);//2.3

        double v = Double.parseDouble(line);
        System.out.println(v + 1);//2.4
    }
}
