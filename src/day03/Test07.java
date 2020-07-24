package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {

        Collection<Emp> col = new ArrayList<>();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工数量：");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            String date = sc.next();
            String[] dateSplit = date.split(",");
            Date d1 = sim.parse(dateSplit[4]);
            Emp e = new Emp(dateSplit[0], Integer.valueOf(dateSplit[1]),
                    dateSplit[2], Integer.valueOf(dateSplit[3]), d1);
            if (col.contains(e)) {
                System.out.println("该用户已存在！");
                i--;
            } else {
                col.add(e);
            }
        }
        System.out.println(col);
    }
}
