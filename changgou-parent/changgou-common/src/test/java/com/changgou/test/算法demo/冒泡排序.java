package com.changgou.test.算法demo;

public class 冒泡排序 {

    public static void bublesort(int[]array) {
        //冒泡排序每两个位置比较谁大谁往后最后位一定最大，第二次不用管最后一位，依次类推
        //思路找个位置i如果最小就和第一位交换，下次从第二位开始找最小依次类推
        int N=array.length-1;
        if (array==null||N<2){
            return;
        }
        for (int i = N; i>=0; i--) {
            for(int second=1;second<=N;second++){
                if (array[second]<array[second-1]){
                    swap(array,second,second-1);
                }

            }
        }

    }

    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-");
        }
    }
    public static void main(String[] args) {
        int []array={2,5,7,3,2,1,8,6,3,9};
        print(array);
        System.out.println();
        bublesort(array); ;
        print(array);
    }

    private static void swap(int[] array, int i, int j) {

        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;

    }
}