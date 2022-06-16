package com.changgou.test.算法demo;

import java.util.Arrays;

public class 选择排序 {

    public static void sort(int[]array) {

        //思路找个位置i如果最小就和第一位交换，下次从第二位开始找最小依次类推
            int N=array.length;
        if (array==null||N<2){
            return;
        }
        for (int i = 0; i < N-1; i++) {
            int minvalueIndex=i;//假设I位置最小
            int minvalue=array[i];
            //找i+1之后位置看有没有更小
            for (int j=i+1;j<N;j++){
                if(minvalue>array[j]){
                    minvalue=array[j];
                    minvalueIndex=j;
                    if (minvalueIndex!=i){
                        array[minvalueIndex]=array[i];
                        array[i]=minvalue;
                        //swap(array,i,minvalueIndex);
                    }
                    System.out.println("第"+(i+1)+"次排序");
                    System.out.println(Arrays.toString(array));
                }

            }

        }

    }

   public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []array={2,5,7,3,2,1,8,6,3,9};
        print(array);
        System.out.println();
        sort(array);
        print(array);
    }
}
