package text;

import java.util.Random;

/**
 * @projectName:
 * @fileName:
 * @packageName: T5
 * @author: Mr.乐
 * @date: 2020/8/10 8:16
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class T5 {
    public static void main(String[] arge){
        Random ran= new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(ran.nextInt(10)+1);
        }
    }

}
