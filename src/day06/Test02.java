package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 *
 * @author Bonnie
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        File file = new File(str + ".txt");
        for (int i = 1; i < 100; i++) {
            if (file.exists()) {
                System.out.println("该文件已存在！");
                file = new File(str + "_副本"+i+".txt");
                continue;
            } else {
                file.createNewFile();
                break;
            }
        }
    }
}
