package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 *
 * @author Bonnie
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile raf = new RandomAccessFile("note.txt", "rw");
        System.out.println("请输入内容：(exit结束)");
        while (true) {
            String str = sc.next();
            if (str.equals("exit")) {
                System.exit(0);
            } else {
                raf.write(str.getBytes());
            }
        }
    }
}
