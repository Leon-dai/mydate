package com.itheima.a04test;

public class Test3 {
    public static void main(String[] args) {
        /*
            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */
        System.out.println(toBinaryString(6));

    }

    public static String toBinaryString(int number) {
        //除基取余法
        //核心逻辑：不断的去除以2，得到余数，一直到商为0就结束。
        //最后还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();

        //利用循环不断的除以2获取余数
        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数 %
            int remainder = number % 2;
//            System.out.println(remainder);
            sb.append(remainder);
            //除以2  /
            number /= 2;
        }
        return sb.reverse().toString();
    }
}
