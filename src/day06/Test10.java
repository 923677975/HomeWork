package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。
 *
 * @author Bonnie
 */
public class Test10 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        String str = sc.next();
        String[] msg = str.split(",");
        Emp emp = new Emp(msg[0], Integer.valueOf(msg[1]), msg[2], Integer.valueOf(msg[3]), sim.parse(msg[4]));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(emp.getName()+".emp"));
        oos.writeObject(emp);
        oos.close();
    }
}
