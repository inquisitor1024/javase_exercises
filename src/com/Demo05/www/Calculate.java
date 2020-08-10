package com.Demo05.www;

import java.util.Random;
import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: Calculate
 * @author: Mr.乐
 * @date: 2020/8/10 9:46
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 1.分析以下需求，并用代码实现(每个小需求都要封装成一个方法)：
 * (1)键盘录入两个数据,求两个数据之和(整数和小数)
 * (2)键盘录入两个数据,判断两个数据是否相等(整数和小数)
 * (3)键盘录入三个数据,获取两个数中较大的值(整数和小数)
 * (4)打印m行n列的星形矩形
 * (5)打印nn乘法表
 * (6)计算长方形和圆形的面积
 */

public class Calculate {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2个数字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两数之和" + summation(a, b));
        System.out.println("两数比较大小" + judge(a, b));
        max(a, b);
        giant(a, b);
        multiplicationTable(a, b);
        area(a, b);

    }

    public static int summation(int i, int j) {
        i += j;
        return i;
    }

    public static String judge(int i, int j) {
        String c = i > j ? "相等" : "不相等";
        return c;
    }

    public static int max(int i, int j) {
        int k = new Scanner(System.in).nextInt();
//        int x = 0;
//        for (int k = 0; k < arr.length; k++) {
//            for (int l = k; l < arr.length; l++) {
//                if (arr[k] < arr[l]) {
//                    int t = arr[k];
//                    arr[k] = arr[l];
//                    arr[l] = t;
//                }
//            }
//        }
//        for (int k = 0; k < arr.length; k++) {
//            x = arr[0];
//
//        }
//        System.out.println("最大值" + x);
        int x = i > j ? i : j  > k ? i > j ? i : j : k;

        return x;
    }

    public static int giant(int i, int j) {
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return i;
    }

    public static void multiplicationTable(int i, int j) {
        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(k + "*" + l + "=" + k * l + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void area(double i, double j) {
        System.out.println("矩形面积为:" + i * j);
        System.out.println("园的面积" + Math.PI * i * i);

    }

}
