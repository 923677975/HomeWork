package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 *
 * @author Bonnie
 */

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String str = new Scanner(System.in).next();

        if (str.matches("[\\d]+")) {
            System.out.println("是整数！\n" + "a * 10 :" + Integer.parseInt(str) * 10);
        } else if (str.matches("[\\d+\\.\\d]+")) {
            System.out.println("是小数！\n" + "b * 5 :" + Double.valueOf(str) * 5);
        } else {
            System.out.println("不是数字");
        }
    }
}
