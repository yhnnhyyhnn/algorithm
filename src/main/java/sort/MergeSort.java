package sort;

import utils.CommonUtils;

/**
 * Created by luokai on 2017/8/12.<br>
 * 归并排序算法<br>
 * 将需要排序的数组分成两个数组，两个数组按顺序进行比较，小的往数组中放。<br>
 * 对数组的拆分使用递归
 */
public class MergeSort {


    public void merge(int[] values,int start,int middle,int end){
        int leftlength = middle-start + 1;
        int rightlength = end - middle;

        int[] leftArray = new int[leftlength + 1];
        int[] rightArray = new int[rightlength + 1];

        //左边数组
        for(int i=0;i<leftlength;i++){
            leftArray[i] = values[start+i];
        }
        leftArray[leftlength] = Integer.MAX_VALUE;
        //右边数组
        for(int j =0;j<rightlength;j++){
            rightArray[j] = values[middle+1+j];
        }
        rightArray[rightlength] = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;
        for(int k=start;k<=end;k++){
            if(leftArray[leftIndex] < rightArray[rightIndex]){
                values[k] = leftArray[leftIndex];
                leftIndex++;
            }else{
                values[k] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public void mergeSort(int[] values,int start,int end){
        if(start < end){
            int middle = (end+start) >>> 1;
            System.out.println(middle);
            mergeSort(values,start,middle);
            mergeSort(values,middle+1,end);
            merge(values,start,middle,end);
        }

    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] values = {3,1,6,5,15,2,14,18,7};
        ms.mergeSort(values,0,values.length-1);

        CommonUtils.print(values);
    }
}
