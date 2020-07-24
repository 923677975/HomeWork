package day03;

import java.util.ArrayList;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("one");
        a.add("two");
        a.add("three");
        System.out.println("该集合的元素个数:"+a.size());
        System.out.println("输出该集合是否包含字符串\"four\":"+a.equals("four"));
        System.out.println("输出集合是否不含有任何元素:"+a.isEmpty());
        System.out.println("清空集合");
        a.clear();
        System.out.println("该集合的元素个数:"+a.size());
        System.out.println("输出集合是否不含有任何元素:"+a.isEmpty());
    }
}
