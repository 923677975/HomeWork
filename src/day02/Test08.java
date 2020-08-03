package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 *
 * @author Bonnie
 */
public class Test08 {
    public static void main(String[] args) {

        System.out.println("请输入员工信息：");
        String message = new Scanner(System.in).next();
        String[] meg = message.split(";");
        Person[] person = new Person[meg.length];

        for (int i = 0; i < meg.length; i++) {
            String[] personData = meg[i].split(",");
            person[i] = new Person(personData[0], Integer.valueOf(personData[1]), personData[2], Integer.valueOf(personData[3]));
            System.out.println(person[i]);
        }
    }
}
