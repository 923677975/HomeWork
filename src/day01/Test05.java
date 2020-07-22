package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] x = new char[5];
        for (int i = 0; i < 5; i++) {
            int y = (int) (Math.random() * 2 + 1);
            if (y == 1) {
                x[i] = (char) (Math.random() * 26 + 65);
            } else {
                x[i] = (char) (Math.random() * 26 + 97);
            }
        }
        String a = new String(x);
        System.out.println(a);
        String str = sc.next();

        if (str.equalsIgnoreCase(a)) {
            System.out.println("输入正确！");
        }
    }
}
