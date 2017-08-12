package sort;

import static java.lang.Thread.sleep;

/**
 * Created by luokai on 2017/8/12.
 * 睡眠排序算法
 * 娱乐型算法，不建议进用实际中。
 * 逻辑：为数组中的每个元素创建一个线程，sleep该数值的时长后输出
 */
public class SleepSort {

    public void sort(int[] values){
        for( final int i : values){
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        sleep(i);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t.start();
        }
    }

    public static void main(String[] args) {
        SleepSort ls = new SleepSort();
        int[] values = {3,1,6,5,15,2,14,18,7};
        ls.sort(values);
    }
}
