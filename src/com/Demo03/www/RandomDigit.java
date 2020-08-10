package com.Demo03.www;

import java.util.Random;

/**
 * @projectName:
 * @fileName:
 * @packageName: RandomDigit
 * @author: Mr.乐
 * @date: 2020/8/9 9:52
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *      随机生成5个1-10的随机数
 */

public class RandomDigit {
    public static void main(String[] arge){
        for (int i = 0; i < 5; i++) {
            System.out.println(new Random().nextInt(10)+1);
        }
    }
}
