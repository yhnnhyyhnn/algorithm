package sort;

import utils.CommonUtils;

/**
 * Created by luokai on 2017/8/12.
 * 插入排序算法
 */
public class InsertionSort {

    public void sort(int[] values){
        //从第二个开始，和前面的进行比较
        for(int j=1;j<values.length;j++){
            int key = values[j];
            int i = j - 1;

            //倒序比较，当前值比上一个小，则交换位置
            while(i>=0 && values[i] > key){
                values[i+1] = values[i];
                i = i - 1;
                values[i+1] = key;
            }
        }

        CommonUtils.print(values);
    }
}
