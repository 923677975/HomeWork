package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 * 使用迭代器遍历集合，并在过程中删除所有的"$"，
 * 最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 *
 * @author Bonnie
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("$");
        list1.add("2");
        list1.add("$");
        list1.add("3");
        list1.add("$");
        list1.add("4");

        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("$")) {
                it.remove();
            }
        }

        for (String str : list1) {
            System.out.println(str);
        }
    }
}
