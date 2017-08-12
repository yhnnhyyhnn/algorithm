package sort;

import utils.CommonUtils;

/**
 * Created by luokai on 2017/8/12.
 * 冒泡排序算法
 * 逻辑：相邻的两个数进行比较，大的放右边，进行升序排列
 */
public class BubbleSort {

    public void sort(int[] values){
        for(int j = values.length - 1;j>0;j--){
            for(int i=0;i<j;i++){
                if(values[i+1] < values[i]){
                    values[i+1] = values[i+1]^values[i];
                    values[i] = values[i+1]^values[i];
                    values[i+1] = values[i+1]^values[i];
                }
            }
        }
        CommonUtils.print(values);
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        int[] values = {3,1,6,5,15,2,14,18,7};
        bs.sort(values);
    }
}
