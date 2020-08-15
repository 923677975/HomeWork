package day06;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * 获取并输出当前目录下所有文件的名字
 *
 * @author Bonnie
 */
public class Test06 {
    @Test
    public void m1() {
        File file = new File(".");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
