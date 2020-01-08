package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mr.tang
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {8, 4, 5, 7, 1, 3, 6, 2}; //
        int[] temp = new int[arr.length]; //
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr,0,arr.length-1,temp  );
        System.out.println( "归并排序后的数据："+ Arrays.toString(arr) );
    }

    public void mergeSort(int[] arr, int left, int right, int[] temp) {
        if(left<right){
            int mid = (left + right) / 2;
            //左边拆分
            mergeSort( arr, left, mid, temp );
            //右边拆分
            mergeSort( arr, mid + 1, right, temp );
            //合并
            merge( arr, left, mid, right, temp );
        }

    }

    public void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int l = left;   // 左边序列开始的序列
        int r = mid + 1;  //右边序列开始的序列
        int t = 0;

        //1 把左边 或者右边的一侧 全部放在temp中
        while (l <= mid && r <= right) {
            //两种情况
            if (arr[l] < arr[r]) {
                temp[t] = arr[l];
                l++;
                t++;
            } else {
                temp[t] = arr[r];
                r++;
                t++;
            }
        }

        //2 把 左边或者右边剩下的放在 temp中

        while (l <= mid) {
            temp[t] = arr[l];
            l++;
            t++;
        }
        while (r <= right) {
            temp[t] = arr[r];
            r++;
            t++;
        }
        //3 把temp 复制在arr中 因为不是每次都是复制全部 所以从left开始
        t = 0;
        int tempIndex = left;
        while (tempIndex <= right) {
            arr[tempIndex] = temp[t];
            t++;
            tempIndex++;
        }
    }
}
