package day06;

import org.junit.Test;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 *
 * @author Bonnie
 */
public class Test08 {
    @Test
    public void m1() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
        raf.writeInt(Integer.MAX_VALUE);
        raf.writeLong(Long.MAX_VALUE);
        raf.seek(0);  //设置指针到指定的位置
        int i = raf.readInt();
        long l = raf.readLong();
        System.out.println(i);
        System.out.println(l);
    }
}
