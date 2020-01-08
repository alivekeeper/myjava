package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mingxiong.tang
 */
public class SelectSort {
    //选择排序思路
    //选定一个 假定第一个小，以此类推  找到第一个最小的数 交换位置 。
    public static void main(String[] args) {
        int[] arrs={123,22,3,55};
        boolean flagTemp=false;
        int i=0;
        int minIndex=i;
        int minValue=arrs[minIndex];

        for(int j=0+i;j<arrs.length;j++){
            if(minValue>arrs[j]){
                flagTemp=true;
                minIndex=j;              //重置最小序列
                minValue=arrs[j];           //重置最小值
            }
        }
        //交换
        if(minIndex!=i && flagTemp){
            arrs[minIndex]=arrs[i];
            arrs[i]=minValue;
        }
        System.out.println( "第"+(i+1)+"轮选择排序输出："+ Arrays.toString(arrs) );

        flagTemp=false;
         i=0+1;
         minIndex=i;
         minValue=arrs[minIndex];

        for(int j=0+i;j<arrs.length;j++){
            if(minValue>arrs[j]){
                flagTemp=true;
                minIndex=j;              //重置最小序列
                minValue=arrs[j];           //重置最小值
            }
        }
        //交换
        if(minIndex!=i &&  flagTemp){
            arrs[minIndex]=arrs[i];
            arrs[i]=minValue;
        }
        System.out.println( "第"+(i+1)+"轮选择排序输出："+ Arrays.toString(arrs) );

        //第三轮
        flagTemp=false;
         i=0+1+1;
         minIndex=i;
         minValue=arrs[minIndex];

        for(int j=0+i;j<arrs.length;j++){
            if(minValue>arrs[j]){
                flagTemp=true;
                minIndex=j;              //重置最小序列
                minValue=arrs[j];           //重置最小值
            }
        }
        //交换
        if(minIndex!=i &&  flagTemp){
            arrs[minIndex]=arrs[i];
            arrs[i]=minValue;
        }
        System.out.println( "第"+(i+1)+"轮选择排序输出："+ Arrays.toString(arrs) );

//        flagTemp=false;
//        i=0+1+1;
//        minIndex=i;
//        minValue=arrs[minIndex];
//
//        for(int j=0+i;j<arrs.length;j++){
//            if(minValue>arrs[j]){
//                flagTemp=true;
//                minIndex=j;              //重置最小序列
//                minValue=arrs[j];           //重置最小值
//            }
//        }
//        //交换
//        if(minIndex!=i &&  flagTemp){
//            arrs[minIndex]=arrs[i];
//            arrs[i]=minValue;
//        }
//        System.out.println( "第"+i+"轮选择排序输出："+ Arrays.toString(arrs) );
        //抽成方法selectSort(arrs);
        int[] arrsA={123,22,3,55};
        SelectSort ss=new SelectSort();
        ss.selectSort( arrsA );
    }
    public void selectSort(int[] arrsA){
        //由此推导
        boolean flagTemp=false;
        int i=0;
        int minIndex=i;
        int minValue=arrsA[minIndex];

        for(int m=0;m<arrsA.length-1;m++){
            flagTemp=false;
            i=m;
            minIndex=i;
            minValue=arrsA[minIndex];

            for(int j=0+i;j<arrsA.length;j++){
                if(minValue>arrsA[j]){
                    flagTemp=true;
                    minIndex=j;              //重置最小序列
                    minValue=arrsA[j];           //重置最小值
                }
            }
            //交换
            if(minIndex!=i &&  flagTemp){
                arrsA[minIndex]=arrsA[i];
                arrsA[i]=minValue;
            }
            System.out.println( "第"+(i+1)+"轮选择排序输出："+ Arrays.toString(arrsA) );
        }
    }
    /**
     * 输出结果：完全一致
     * 第1轮选择排序输出：[3, 22, 123, 55]
     * 第2轮选择排序输出：[3, 22, 123, 55]
     * 第3轮选择排序输出：[3, 22, 55, 123]
     * //推导后
     * 第1轮选择排序输出：[3, 22, 123, 55]
     * 第2轮选择排序输出：[3, 22, 123, 55]
     * 第3轮选择排序输出：[3, 22, 55, 123]
     */
}
