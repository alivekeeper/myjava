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
    }
}
