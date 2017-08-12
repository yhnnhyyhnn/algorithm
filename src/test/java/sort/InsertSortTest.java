package sort;

import org.junit.Test;

/**
 * Created by luokai on 2017/8/12.
 */
public class InsertSortTest {

    @Test
    public void test(){
        InsertionSort is = new InsertionSort();
        int[] values = {3,1,6,5,15,2,14,18,7};
        is.sort(values);
    }
}
