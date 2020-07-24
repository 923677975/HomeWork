package day04;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");

        System.out.println("获取集合第二个元素并输出:" + list1.get(2));

        list1.set(3, "3");
        System.out.println(list1);

        list1.add(2,"2");
        System.out.println(list1);

        list1.remove(3);
        System.out.println(list1);
    }
}
