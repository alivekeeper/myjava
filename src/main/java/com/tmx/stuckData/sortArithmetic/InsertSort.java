package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mingxiong.tang
 */
public class InsertSort {
    /**
     *1.思路
     */
    public static void main(String[] args) {

        int[] arr={133,22,44,1};

        int insertValue=arr[1];
        int insertIndex=1-1; //插入数据的前一个数的下标

        /**
         * 1. insertIndex >=0 确保数组不越界
         * 2. insertValue>arr[insertIndex] 确保未找到插入位置
         * 3. indexIndex 移动
         */
        while (insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex+1]=insertValue;
        System.out.println( "第"+(insertIndex+1)+"轮插入排序推导："+ Arrays.toString(arr) );

        insertValue=arr[2];
        insertIndex=2-1; //插入数据的前一个数的下标

        /**
         * 1. insertIndex >=0 确保数组不越界
         * 2. insertValue>arr[insertIndex] 确保未找到插入位置
         * 3. indexIndex 移动
         */
        while (insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex+1]=insertValue;
        System.out.println( "第"+(insertIndex+1)+"轮插入排序推导："+ Arrays.toString(arr) );


        insertValue=arr[3];
        insertIndex=3-1; //插入数据的前一个数的下标
        /**
         * 1. insertIndex >=0 确保数组不越界
         * 2. insertValue>arr[insertIndex] 确保未找到插入位置
         * 3. indexIndex 移动向前移动  一个一个往前比
         */
        while (insertIndex >= 0 && insertValue < arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex+1]=insertValue;
        System.out.println( "第"+(insertIndex+1)+"轮插入排序推导："+ Arrays.toString(arr) );
        
        
        //由此推到
        int[] arrI={133,22,44,1};
        InsertSort is= new InsertSort();
        is.insertSort( arrI );
    }
    
    public void insertSort(int[] arr){
        int insertValue=0;
        int insertIndex=0; //插入数据的前一个数的下标
        for(int i=1;i<arr.length;i++){
            insertValue=arr[i];
            insertIndex=i-1; //插入数据的前一个数的下标
            /**
             * 1. insertIndex >=0 确保数组不越界
             * 2. insertValue>arr[insertIndex] 确保未找到插入位置
             * 3. indexIndex 移动向前移动  一个一个往前比
             */
            while (insertIndex >= 0 && insertValue < arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertValue;
            System.out.println( "推导后: 第"+(insertIndex+1)+"轮插入排序："+ Arrays.toString(arr) );
        }
    }

    /**
     * 输出结果 --与预期相符
     * 第0轮插入排序推导：[22, 133, 44, 1]
     * 第1轮插入排序推导：[22, 44, 133, 1]
     * 第0轮插入排序推导：[1, 22, 44, 133]
     * 推导后: 第0轮插入排序：[22, 133, 44, 1]
     * 推导后: 第1轮插入排序：[22, 44, 133, 1]
     * 推导后: 第0轮插入排序：[1, 22, 44, 133]
     */
}
