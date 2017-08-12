package sort;

import org.junit.Test;

/**
 * Created by luokai on 2017/8/12.
 */
public class SleepSortTest {

    @Test
    public void test(){
        SleepSort ls = new SleepSort();
        int[] values = {3,1,6,5,15,2,14,18,7};
        ls.sort(values);
    }
}
