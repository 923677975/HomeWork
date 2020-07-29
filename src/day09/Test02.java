package day09;

/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 *
 * @author Bonnie
 */
public class Test02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void nihao() {
        Test02 t = new Test02();
        Thread thread = new Thread(t, "你好");
        thread.start();
    }

    public static void zaijian() {
        Test02 t1 = new Test02();
        Thread thread1 = new Thread(t1, "再见");
        thread1.start();
    }

    public static void main(String[] args) {
        nihao();
        zaijian();
    }
}
