package com.Demo05.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: PrimeNumber
 * @author: Mr.乐
 * @date: 2020/8/10 16:59
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 * 2.分析以下需求，并用代码实现：(封装成方法)
 * 	(1)打印1到100之内的整数，但数字中包含9的要跳过
 * 	(2)每行输出5个满足条件的数，之间用空格分隔
 * 	(3)如：
 * 		1 2 3 4  5
 * 		6 7 8 10 11
 */

public class PrimeNumber {
    public static void main(String[] arge){
        int sum = -1;
        for (int i = 1; i <= 100; i++) {
            if(i % 10 != 9 && i %100 /10 != 9){
                sum += 1;
                if(sum % 5 == 0 ){
                    System.out.println(" ");
                }
                System.out.print(i+"\t");
            }
        }
    }

}
