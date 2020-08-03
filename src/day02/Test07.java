package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            String[] a = str.split("[\\-\\+\\*\\/]");
            System.out.println(a[0] + "+" + a[1] + "=" + (Double.valueOf(a[0]) + Double.valueOf(a[1])));
        }
    }
}
