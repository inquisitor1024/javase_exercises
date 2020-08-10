package com.Demo04.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: PrimeNumber
 * @author: Mr.乐
 * @date: 2020/8/10 8:33
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class PrimeNumber {
    public static void main(String[] arge) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.println(i);
                sum += 1;
            }
        }
        System.out.println("素数有:" + sum);
    }

}
