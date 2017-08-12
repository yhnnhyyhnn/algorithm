package sort;

import org.junit.Test;

/**
 * Created by luokai on 2017/8/12.
 */
public class BubbleSortTest {
    @Test
    public void test(){
        BubbleSort bs = new BubbleSort();

        int[] values = {3,1,6,5,15,2,14,18,7};
        bs.sort(values);
    }
}
