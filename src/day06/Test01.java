package day06;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 *
 * @author Bonnie
 */
public class Test01 {

    @Test
    public void m1() throws IOException {
        File file = new File("src/day06/myfile.txt");
        file.createNewFile();

        System.out.println("名字:" + file.getName());
        System.out.println("大小:" + file.length());
        Date d = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        d.setTime(file.lastModified());
        System.out.println("最后修改时间:" + sim.format(d));

    }
}
