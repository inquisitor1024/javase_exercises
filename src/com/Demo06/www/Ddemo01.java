package com.Demo06.www;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @projectName:
 * @fileName:
 * @packageName: Ddemo01
 * @author: Mr.乐
 * @date: 2020/8/10 18:11
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 5.定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
 * A：遍历集合遍历输出。
 * B：求出年龄最大的学生，让后将该对象的姓名变为：小米。
 */

public class Ddemo01 {
    public static void main(String[] arge) {
        ArrayList<Student> list = new ArrayList<>();
        Student str1 = new Student("张三", 15, "男");
        Student str2 = new Student("李四", 14, "男");
        Student str3 = new Student("王五", 16, "男");

        list.add(str1);
        list.add(str2);
        list.add(str3);
        // 遍历集合
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        Iterator<Student> it = list.iterator();
        int index = 0;
        int ageArray[] = new int[list.size()];
        while (it.hasNext()) {
            System.out.println(it.next());
            ageArray[index] = list.get(index).getAge();
            index++;
        }



        //找出年龄最大的
        int max = ageArray[0];
        for (int i = 0; i < ageArray.length; i++) {
            if (max < ageArray[i]) {
                max = ageArray[i];
            }
        }

        for (Student str : list) {
            if (str.getAge() == max) {
                str.setName("小米");
            }
        }
        System.out.println();
        for (Student str00 : list) {
            System.out.println(str00);
        }

    }

}
