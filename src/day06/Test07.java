package day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        Test07 t = new Test07();
        //t.copy1("a");
        t.copy2("a");
    }

    /**
     * 使用单字节方式复制
     *
     * @param name 要复制的文件名
     */
    public void copy1(String name) throws IOException {
        FileInputStream is = new FileInputStream(name+".txt");
        FileOutputStream os = new FileOutputStream(name + "_copy.txt");
        int len;
        while ((len = is.read()) != -1) {
            os.write(len);
        }
    }

    /**
     * 使用字节数组形式复制
     *
     * @param name 要复制的文件名
     */
    public void copy2(String name) throws IOException {
        FileInputStream is = new FileInputStream(name+".txt");
        FileOutputStream os = new FileOutputStream(name + "_copy1.txt");
        int len;
        byte[] b = new byte[1024];
        while ((len = is.read(b)) != -1) {
            os.write(b, 0, len);
        }
    }
}
