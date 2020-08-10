package com.Demo04.www;

import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: ScoreGrade
 * @author: Mr.乐
 * @date: 2020/8/10 8:21
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 1.编写代码实现如下内容：if语句实现考试成绩分等级(使用switch语句)。
 * [90-100]	A等。
 * [80-90) 	B等。
 * [70-80) 	C等。
 * [60-70) 	D等。
 * [0-60)  	E等。
 * 请根据给定成绩，输出对应的等级。
 * 说明："["表示包含，")"表示不包含
 * 代码：
 */

public class ScoreGrade {
    public static void main(String[] arge) {
        System.out.println("请输入考试成绩,成绩范围1-100");
        char a = 0;
        int grade = new Scanner(System.in).nextInt();
        if (90 <= grade && 100 <= grade) {
            a = 'a';
        } else if (90 > grade && 80 <= grade) {
            a = 'b';
        } else if (80 > grade && 70 <= grade) {
            a = 'c';
        } else if (70 > grade && 60 <= grade) {
            a = 'd';
        } else if (60 > grade && 0 <= grade) {
            a = 'e';
        } else {
            System.out.println("请按规定输入有效数字！");
        }

        switch (a) {
            case 'a':
                System.out.println("A等");
                break;
            case 'b':
                System.out.println("B等");
                break;
            case 'c':
                System.out.println("C等");
                break;
            case 'd':
                System.out.println("D等");
                break;
            case 'e':
                System.out.println("E等");
                break;
            default:
                System.out.println("请输入有效数字");
                break;
        }
    }

    /**
     * @projectName:
     * @fileName:
     * @packageName: TotalSales
     * @author: Mr.乐
     * @date: 2020/8/10 9:37
     * @copyright(c): 无
     * @versions: 1.0版本
     * @instructions:
     * B:公司年销售额求和
     * 某公司按照季度和月份统计的数据如下：单位(万元)
     * 第一季度：22,66,44
     * 第二季度：77,33,88
     * 第三季度：25,45,65
     * 第四季度：11,66,99
     */

    public static class TotalSales {
        public static void main(String[] arge){
            int sum0 =0;
            int sum[][] = { { 22, 66, 44 }, { 77, 33, 88 }, { 25, 45, 65 }, { 11, 66, 99 } };
            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[i].length; j++) {
                    sum0 += sum[i][j];
                }
            }
            System.out.println("销售总额为："+sum0);
        }
    }
}
