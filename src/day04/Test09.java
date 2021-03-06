package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 *
 * @author Bonnie
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Emp> al = new ArrayList<>();
        String str = sc.next();
        String[] a = str.split(";");
        for (int i = 0; i < a.length; i++) {
            String[] b = a[i].split(",");
            Date d1 = sim.parse(b[4]);
            al.add(new Emp(b[0],Integer.valueOf(b[1]),b[2],Integer.valueOf(b[3]),d1));
        }
        System.out.println(al);
    }
}
