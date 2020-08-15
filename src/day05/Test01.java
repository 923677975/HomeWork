package day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 *
 * @author Bonnie
 */
public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);

        for (int a : list) {
            System.out.println(a);
        }
    }
}
