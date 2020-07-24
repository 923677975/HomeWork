package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);

        List<Integer> al1 = al.subList(3, 7);
        System.out.println(al1);
        for (int i = 0; i < 3; i++) {
            al1.set(i, al1.get(i) * 10);
        }
        System.out.println(al1);

        System.out.println(al);

        al.subList(7,10).clear();
        System.out.println(al);
    }
}
