package com.Demo03.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: RightTriangle
 * @author: Mr.乐
 * @date: 2020/8/9 9:48
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *      打印直角三角形
 */

public class RightTriangle {
    public static void main(String[] arge){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
