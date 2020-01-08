package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mingxiong.tang
 * @Date: 2020/1/8 14:08
 */
public class QuickSort {
    /**
     * 思路：
     *   选定数组中的一个数为 选定数 mid   把比mid小的数放left  反之放right
     *   类推
     *   排序完成
     */
    public static void main(String[] args) {
        int[] arr= {-9,78,0,23,-567,70};
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort( arr,0,arr.length-1 );
        System.out.println( "快排结果："+ Arrays.toString(arr) );
    }
    public void quickSort(int[] arr,int left,int right){
        int pivod=(left+right)/2; //中轴
        int l =left;        //左右遍历
        int r =right;
        while (l<r){

            //左边的位置找到比 mid大的数
            while(arr[pivod]>arr[l] && l<r){
                l++;
            }

            //右边的位置找到比 mid小的数
            while(arr[pivod] < arr[r] && l<r){
                r--;
            }

            if(l>=r){
                break;
            }
            //左右交换位置
            int temp =arr[l];
            arr[l] =arr[r];
            arr[r]=temp;

            //优化，如果左右两边数据相等 可移动
            if(arr[l]==arr[pivod]){
                l++;
            }

            if(arr[r]==arr[pivod]){
                r--;
            }

        }
        if(l<right){
            quickSort( arr,left,pivod );
        }
        if(r>left){
            quickSort( arr,pivod+1,right );
        }
//        System.out.println( "快排结果："+ Arrays.toString(arr) );
    }
}
