package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mr.tang
 */
public class RadixSort {
    /**
     *1.思路 基数 排序基于桶排序  0 ---》9 个桶
     *  第一轮 根据 个位 排序
     *  第二轮根据 十位排序
     */
    public static void main(String[] args) {
        int arr[] = { 53, 3, 542, 748, 14, 214};
        int arr1[] = { 53, 3, 542, 748, 14, 214};
        RadixSort radixSort=new RadixSort();
        radixSort.radixSort( arr );
        radixSort.radixSort1( arr1 );
        System.out.println( "基数排序后的数组："+ Arrays.toString(arr1) );
    }
    public void radixSort(int[] arr){

        //1 .一个二维数组标识桶
        //2.一个数组表示每个桶里面的个数
        //3.循环取桶里面的数据
        int[][] buckets=new int[10][arr.length];
        int[]  bucketElementCounts=new int[10];

        int element=0;
        for(int i=0;i<arr.length;i++){
            element=arr[i]%10; //第一轮个位数
            buckets[element][bucketElementCounts[element]]=arr[i];
            bucketElementCounts[element]++;
        }
        int insertIndex=0;
        //取值
        for(int i=0;i<bucketElementCounts.length;i++){
            if(bucketElementCounts[i]!=0){
                for(int j=0;j<bucketElementCounts[i];j++){
                    arr[insertIndex]=buckets[i][j];
                    insertIndex++;
                }
                bucketElementCounts[i]=0;
            }
        }
        System.out.println( "基数排序后"+1+"的数组："+ Arrays.toString(arr) );
        //第二轮基数排序

        for(int i=0;i<arr.length;i++){
            element=arr[i]/10 %10; //第一轮个位数
            buckets[element][bucketElementCounts[element]]=arr[i];
            bucketElementCounts[element]++;
        }
         insertIndex=0;
        //取值
        for(int i=0;i<bucketElementCounts.length;i++){
            if(bucketElementCounts[i]!=0){
                for(int j=0;j<bucketElementCounts[i];j++){
                    arr[insertIndex]=buckets[i][j];
                    insertIndex++;
                }
                bucketElementCounts[i]=0;
            }

        }
        System.out.println( "基数排序后"+2+"的数组："+ Arrays.toString(arr) );

        //第三轮基数排序
        for(int i=0;i<arr.length;i++){
            element=arr[i]/100 %10; //第一轮个位数
            buckets[element][bucketElementCounts[element]]=arr[i];
            bucketElementCounts[element]++;
        }
         insertIndex=0;
        //取值
        for(int i=0;i<bucketElementCounts.length;i++){
            if(bucketElementCounts[i]!=0){
                for(int j=0;j<bucketElementCounts[i];j++){
                    arr[insertIndex]=buckets[i][j];
                    insertIndex++;
                }
            }
        }
        System.out.println( "基数排序后"+3+"的数组："+ Arrays.toString(arr) );
    }
    public void radixSort1(int[] arr){
        //1.找到最大数的位数
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int maxLength= (max+"").length();
        //2.循环最大数的位数
        //3 .一个二维数组标识桶
        //4.一个数组表示每个桶里面的个数
        //5.循环取桶里面的数据
        int[][] buckets=new int[10][arr.length];
        int[]  bucketElementCounts=new int[10];

        int element=0;
        int insertIndex=0;
        for(int m=0,step=1;m<=maxLength;step*=10,m++){
            bucketElementCounts=new int[10];
            //第三轮基数排序

            for(int i=0;i<arr.length;i++){
                element=arr[i]/step %10; //第一轮个位数
                buckets[element][bucketElementCounts[element]]=arr[i];
                bucketElementCounts[element]++;
            }
            insertIndex=0;
            //取值
            for(int i=0;i<bucketElementCounts.length;i++){
                if(bucketElementCounts[i]!=0){
                    for(int j=0;j<bucketElementCounts[i];j++){
                        arr[insertIndex]=buckets[i][j];
                        insertIndex++;
                    }
                    bucketElementCounts[i]=0;
                }
            }
        }
    }

}
