package com.Demo06.www;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @projectName:
 * @fileName:
 * @packageName: Demo02
 * @author: Mr.乐
 * @date: 2020/8/10 23:12
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *   定义一个手机类Phone，包含三个属性品牌(brand)、价格(price)、颜色(color)。
 *         创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象存入ArrayList集合中，并遍历输出。
 *
 */

public class Demo02 {
    public static void main(String[] arge){
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1999,"红");
        Phone p2 = new Phone("华为",2999,"蓝");
        Phone p3 = new Phone("乐视",2000,"黑");
        Phone p4 = new Phone("奇酷",2100,"黑");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        for(Phone str : list){
            System.out.println(str);
        }

        System.out.println();
        Iterator<Phone> p = list.iterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }


    }

}
