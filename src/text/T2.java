package text;

/**
 * @projectName:
 * @fileName:
 * @packageName: T2
 * @author: Mr.乐
 * @date: 2020/8/10 8:00
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *      打印1-100之内的整数，数字缝7跳过
 */

public class T2 {
    public static void main(String[] arge){
        for (int i = 0; i <= 100; i++) {
            if(i %10 != 7 && i %100/10 !=7 ){
                System.out.println(i);
            }
        }
    }

}
