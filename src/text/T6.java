package text;

import com.Demo06.www.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @projectName:
 * @fileName:
 * @packageName: T6
 * @author: Mr.乐
 * @date: 2020/8/10 22:36
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class T6 {
    public static void main(String[] arge){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
          System.out.println("第"+ (i+1) +"个学生姓名:");
          list.add(new Scanner(System.in).nextLine());
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //
        for(String str :list){
            System.out.println(str);
        }
    }

}
