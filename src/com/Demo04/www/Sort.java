package com.Demo04.www;

import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: Sort
 * @author: Mr.乐
 * @date: 2020/8/10 9:18
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 
 * 
 * */

public class Sort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            int k = arr.length-1;
            System.out.println("最大值:"+arr[k]);
            System.out.println("最小值:"+arr[0]);
            break;
        }
    }

}
