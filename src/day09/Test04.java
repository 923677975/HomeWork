package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat sim = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Thread t = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    Date date = new Date();
                    String a = sim.format(date.getTime());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(a);
                }
            }
        };
        t.start();
    }
}
