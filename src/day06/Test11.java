package day06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 *
 * @author Bonnie
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] str = {"张.emp", "张三.emp", "李四.emp","六.emp","王五.emp"};
        ArrayList<Emp> list = new ArrayList<>();
        for (String a : str) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(a));
            list.add((Emp) ois.readObject());
        }
        list.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
    }
}
