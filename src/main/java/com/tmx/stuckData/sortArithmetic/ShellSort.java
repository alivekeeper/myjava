package com.tmx.stuckData.sortArithmetic;

import java.util.Arrays;

/**
 * @author mingxiong.tang
 * @Date: 2020/1/8 10:24
 */
public class ShellSort {
    /**
     * 1.希尔排序是对插入排序极端的补充。
     *   1.1 {99,44,43,55,1} 最后一个插入要移动最坏的次数
     *   改进 希尔排序
     *   1.2 每次步长减半 交换  例如 99 和 43 交换 44 和55 （正常排序不交换） 43 44 99 55 1
     *                            第二轮 步长为 43 44 55 99 1 =》 1 43 44 55 99
     */
    public static void main(String[] args) {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        int[] arr1 = {8,9,1,7,2,3,5,4,6,0};
        int[] arr2 = {8,9,1,7,2,3,5,4,6,0};

        ShellSort shellSort = new ShellSort();
        shellSort.shellSort( arr );

        shellSort.shellSort1( arr1 );

        /**
         * 在极端 数据量大 情况下 做交换的效率并不高，
         * 由此改进 用插入排序 位移法
         */
        shellSort.shellSort2( arr2 );
    }

    /**
     * 位移法 希尔排序
     * @param arr
     */

    private void shellSort2(int[] arr) {
        /**
         * 由此可推导
         */
        int step=arr.length/2;
        int inserIndex=0;
        int inserValue=0;
        for(int i=1;step>0;step/=2,i++){
            for (int j = step; j <arr.length; j++) {   //重点解释一下 内部  1. 带插入数的 下标 和值 初始化，  2，移动下标和值，  3，找到位置

                inserIndex=j;
                inserValue=arr[inserIndex];

                if(arr[inserIndex]<arr[inserIndex-step]){
                    while(inserIndex - step >= 0 && inserValue < arr[inserIndex - step]){
                        arr[inserIndex]=arr[inserIndex-step];
                        inserIndex-=step;
                    }
                    arr[inserIndex]=inserValue;
                }

            }
            System.out.println( "位移法----第"+i+"轮希尔排序："+Arrays.toString( arr ) );
        }
    }

    public void shellSort(int[] arr){

        int step =arr.length/2;
        for(int i=step;i<arr.length;i++){
            for(int j=i-step;j>=0;j-=step){
                if(arr[j+step]<arr[j]){  //特别说明 不是i 和 j 比较 是 j 和后面j+step 比较 思维误区
                    int temp=arr[j+step];
                    arr[j+step]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        System.out.println( "第"+1+"轮希尔排序："+Arrays.toString( arr ) );

        step =step/2;
        for(int i=step;i<arr.length;i++){
            for(int j=i-step;j>=0;j-=step){
                if(arr[j+step]<arr[j]){  //特别说明 不是i 和 j 比较 是 j 和后面j+step 比较 思维误区
                    int temp=arr[j+step];
                    arr[j+step]=arr[j];
                    arr[j]=temp;
                }
            }

        }


        System.out.println( "第"+2+"轮希尔排序："+Arrays.toString( arr ) );

        step =step/2;
        for(int i=step;i<arr.length;i++){
            for(int j=i-step;j>=0;j-=step){
                if(arr[j+step]<arr[j]){  //特别说明 不是i 和 j 比较 是 j 和后面j+step 比较 思维误区
                    int temp=arr[j+step];
                    arr[j+step]=arr[j];
                    arr[j]=temp;
                }
            }

        }


        System.out.println( "第"+3+"轮希尔排序："+Arrays.toString( arr ) );

    }
    public void shellSort1(int[] arr){

        /**
         * 由此可推导
         */
        int step=arr.length/2;
        for(int s=1;step>0;step/=2,s++){
            for(int i=step;i<arr.length;i++){
                for(int j=i-step;j>=0;j-=step){
                    if(arr[j+step]<arr[j]){  //特别说明 不是i 和 j 比较 是 j 和后面j+step 比较 思维误区
                        int temp=arr[j+step];
                        arr[j+step]=arr[j];
                        arr[j]=temp;
                    }
                }

            }

            System.out.println( "第"+s+"轮希尔排序："+Arrays.toString( arr ) );
        }
    }
}
