package com.Demo02.com;

import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: Evaluation
 * @author: Mr.乐
 * @date: 2020/8/9 8:58
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *  1、已知一个三位数，请分别获取该三位数上每一位的数值
 */

public class Evaluation {
    public static void main(String[] arge){
        @SuppressWarnings("resource")
        char chs[] = String.valueOf(new Scanner(System.in).nextInt()).toCharArray();
        System.out.println("个位是:"+chs[2]+"\n十位是:"+chs[1]+"\n百位是:"+chs[0]);
    }



}
