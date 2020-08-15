package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File file = new File(str + "");
        for (int i = 1; i < 100; i++) {
            if (file.exists()) {
                System.out.println("该目录存在了!");
                file = new File(str + "_副本_" + i);
                continue;
            } else {
                file.mkdirs();
                break;
            }
        }
    }
}
