package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个email地址：");
        String str = sc.next();
        if (str.indexOf("@") == -1) {
            System.out.println("不存在！");
        } else {
            String s = str.substring(0, str.indexOf("@"));
            System.out.println(s);
        }
    }
}
