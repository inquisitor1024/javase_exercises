package com.Demo03.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: HopCount
 * @author: Mr.乐
 * @date: 2020/8/10 8:33
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class HopCount {
    public static void main(String[] arge) {
        int k = 7;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 7 && i % 100 / 10 != 7) {
                System.out.println(i);
            }

        }
    }

}
