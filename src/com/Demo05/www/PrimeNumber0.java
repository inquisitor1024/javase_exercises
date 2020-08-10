package com.Demo05.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: PrimeNumber0
 * @author: Mr.乐
 * @date: 2020/8/10 17:07
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 2.分析以下需求，并用代码实现：(封装成方法)
 * (1)打印1-100之间的所有素数及个数
 * (2)每行输出5个满足条件的数，之间用空格分隔
 * 注意：大于1的能被1和其本身整除的数叫素数。
 */

public class PrimeNumber0 {
    public static void main(String[] arge) {
        int k = 2;
        for (int i = 0; i <= 100; i++) {
            if(i > k){
                if(i % k != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
