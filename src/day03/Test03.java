package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sp.parse(str);
        System.out.println(sp.format(date));
        long time = System.currentTimeMillis();
        long time1 = date.getTime();
        System.out.println((time-time1) / 1000 / 60 / 60 / 24 / 7);
    }
}
