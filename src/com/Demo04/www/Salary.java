package com.Demo04.www;

import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: Salary
 * @author: Mr.乐
 * @date: 2020/8/10 8:58
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: (1)根据工龄(整数)给员工涨工资(整数), 工龄和基本工资通过键盘录入
 * (2)涨工资的条件如下：
 * [10-15)     +5000
 * [5-10)      +2500
 * [3~5)       +1000
 * [1~3)       +500
 * [0~1)       +200
 * (3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 */

public class Salary {
    public static void main(String[] arge) {
        System.out.println("请输入基本工资");
        double salary = new Scanner(System.in).nextInt();
        System.out.println("请输入工龄 提示: 0- 15");
        int seniority = new Scanner(System.in).nextInt();
        if (seniority >= 10 && seniority < 15) {
            salary += 5000;
            System.out.println("您目前工作了" + seniority + "基本工资为" + salary + "元，应涨工资5000元，涨后工资" + salary + "元");
        } else if (seniority >= 5 && seniority < 10) {
            salary += 2500;
            System.out.println("您目前工作了" + seniority + "基本工资为" + salary + "元，应涨工资2500元，涨后工资" + salary + "元");

        } else if (seniority >= 3 && seniority < 5) {
            salary += 1000;
            System.out.println("您目前工作了" + seniority + "基本工资为" + salary + "元，应涨工资1000元，涨后工资" + salary + "元");
        } else if (seniority >= 1 && seniority < 3) {
            salary += 500;
            System.out.println("您目前工作了" + seniority + "基本工资为" + salary + "元，应涨工资500元，涨后工资" + salary + "元");

        } else if (seniority >= 0 && seniority < 1) {
            salary += 200;
            System.out.println("您目前工作了" + seniority + "基本工资为" + salary + "元，应涨工资200元，涨后工资" + salary + "元");
        }else{
            System.out.println("请输入有效数字！");
        }
    }

}
