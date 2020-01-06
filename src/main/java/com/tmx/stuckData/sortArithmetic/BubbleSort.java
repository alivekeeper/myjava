package com.tmx.stuckData.sortArithmetic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author mingxiong.tang
 * @Date: 2020/1/6 11:52
 */
public class BubbleSort {
    //推导步骤
    //第一轮 第二轮第三轮 证明公式

    public static void main(String[] args) {

        int[] arr={111,55,6,77};
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                 int temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
            }
        }
        System.out.println( "第"+(i+1)+"轮数据："+ Arrays.toString(arr) );

        i=i+1;

        for(int j=1+i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println( "第"+(i+1)+"轮数据："+ Arrays.toString(arr) );

        i=i+1;

        for(int j=1+i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println( "第"+(i+1)+"轮数据："+ Arrays.toString(arr) );
        //由此推导出 冒泡排序算法 双重循环
        int[] arrO={111,55,6,77};
        for(int m=0;m<arrO.length-1;m++){
            for(int j=1+m;j<arrO.length;j++){
                if(arrO[m]>arrO[j]){
                    int temp=arrO[j];
                    arrO[j]=arrO[m];
                    arrO[m]=temp;
                }
            }
            System.out.println( "标准化第"+(m+1)+"轮数据："+ Arrays.toString(arrO) );
        }
    }
}
