package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 *
 * @author Bonnie
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证：");
        String str;
        while (true) {
            str = sc.next();
            if (str.length() != 18) {
                System.out.println("输入有误!");
            } else {
                System.out.println("输入正确！");
                break;
            }
        }
        SimpleDateFormat sp = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sp1.format(sp.parse(str.substring(6, 14))));
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(sp.parse(str.substring(6, 14)));
        calendar.add(Calendar.YEAR,20);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        System.out.println(sp1.format(calendar.getTime()));
    }
}
