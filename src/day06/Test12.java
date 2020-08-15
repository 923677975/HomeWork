package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 *
 * @author Bonnie
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Calendar calendar = Calendar.getInstance();
        String[] str = {"张.emp", "张三.emp", "李四.emp", "六.emp", "王五.emp"};
        Emp emp;
        Map<String, Emp> map = new LinkedHashMap<>();
        for (String a : str) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(a));
            emp = (Emp) ois.readObject();
            map.put(emp.getName(), emp);
        }
        //System.out.println(map);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询员工的姓名:");
        String name = sc.next();
        if (map.containsKey(name)) {
            System.out.println(map.get(name));
            calendar.setTime(map.get(name).getHiredate());
            calendar.add(Calendar.YEAR,20);
            System.out.println(calendar.getTime());
        } else {
            System.out.println("查无此人！");
        }
    }
}
