package day05;

import java.util.*;
import java.util.Map.Entry;

/**
 * 创建一个Map，保存某个学生的成绩:
 * 在控制台输入该学生成绩，格式:
 * 科目:成绩;科目:成绩;...
 * 例如:
 * 语文:99;数学:98;英语:97;物理:96;化学:95
 * 然后输出物理的成绩。
 * 然后将化学的成绩设置为96
 * 然后删除英语这一项。
 * 然后遍历该Map分别按照遍历key，Entry，value
 * 的形式输出该Map信息。
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String input = sc.next();
        String[] mag = input.split(";");
        for (int i = 0; i < mag.length; i++) {
            String[] s = mag[i].split(":");
            map.put(s[0], Integer.valueOf(s[1]));
        }
        System.out.println("物理成绩：" + map.get("物理"));
        System.out.println(map);

        map.put("化学", 96);
        System.out.println(map);

        map.remove("英语");
        System.out.println(map);

        Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println();

        Set<Entry<String, Integer>> set1 = map.entrySet();
        for (Entry<String, Integer> en : set1) {
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key + "=" + value);
        }

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }

}
