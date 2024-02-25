package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~100之间的整数，并添加到集合中。
            直到集合中所有数据和超过200为止。
         */

        //1.创建一个集合用来添加整数 集合中不能存储基本数据类型，只能存储其包装类
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据添加到集合中
        //for循环知道次数的时候用，while循环不知道次数，知道终止条件的时候用
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            System.out.println(num);
            //先把异常数据进行过滤
            if (num < 1 || num > 100) {
                System.out.println("当前数字不在1~100的范围当中，请重新输入");
                continue;
            }
            //添加到集合中
            //细节：
            //num：基本数据类型
            //集合里面的数据是Integer
            //在添加数据的时候触发了自动装箱
            list.add(num);

            //统计集合中的所有的数据和
            int sum = getSum(list);
            if(sum > 200){
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }
        //验证一下结论
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //i:索引
            //list.get(i);
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
