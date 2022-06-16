package com.changgou.test.算法demo;

public class 插入排序 {
    public static void sort(int[]array) {

        //思路插入位置和前一个数比较，小就往前移动一位，新插入位置索引减一继续和前一个比较直到比前一个大或者第一位停住
        int N=array.length;
        if (array==null||N<2){
            return;
        }
        /**
         * 1,
         * 1,2
         * 1,2,3
         */
        //最后一位end和前一位比较
        for (int end=1; end < N; end++) {
            //假设新插入数据在end位置
            int newNumIndex=end;
            while(newNumIndex-1>=0&&array[newNumIndex]<array[newNumIndex-1]){
                swap(array, newNumIndex, newNumIndex-1);
                newNumIndex--;
            }

        }

    }

   public static void sort2(int[]array){
       int N=array.length;
       if (array==null||N<2){
           return;
       }
       for (int end=1; end < N; end++) {
           for (int pre = end - 1; pre >=0 && array[pre] > array[pre + 1]; pre--) {
               swap(array, pre, pre + 1);
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
        //sort(array) ;
        sort3(array);
        print(array);
    }

    private static void swap(int[] array, int i, int j) {

        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;

    }

    public static void sort3(int[]array){
        int N=array.length;
        if ((N<2||array==null)){
            return;
        }
        for (int end=1;end<N;end++){
            for (int pre=end-1;pre>=0&&array[pre]>array[pre+1];pre--){
                swap(array,pre,pre+1);
            }
        }
    }
}
