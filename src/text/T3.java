package text;

/**
 * @projectName:
 * @fileName:
 * @packageName: T3
 * @author: Mr.乐
 * @date: 2020/8/10 8:04
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 1-100 之间的质数
 */

public class T3 {
    public static void main(String[] arge) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            int j = 2;
            while (i > j) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.println(i);
                sum += 1;
            }
        }
        System.out.println("素数有:" + sum);
    }

}
