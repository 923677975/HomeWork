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
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        String[] mes = message.split("\\;");
        Person[] person = new Person[mes.length];

        for (int i = 0; i < person.length; i++) {

            String personMes = mes[i];
            String[] personData = personMes.split("\\,");
            String name = personData[0];
            int age = Integer.valueOf(personData[1]);
            String gender = personData[2];
            int salary = Integer.valueOf(personData[3]);
            Person p = new Person(name, age, gender, salary);
            person[i] = p;
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
