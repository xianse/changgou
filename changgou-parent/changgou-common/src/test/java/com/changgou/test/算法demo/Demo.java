package com.changgou.test.算法demo;

import java.util.Arrays;

public class Demo {

        public static int  sort(int[]array,int m,int n) {

            //
            int N=array.length;
          //int []array={2,5,7,3,2,1,8,6,3,9};
            //帮助数组，当前索引值为原数组当前索引值加上0到当前索引之和
            // {2,7,14,17,19,20,28,34,37,46}
            int sum=0;
            int sumn=0;
            int summ=0;
            int[]help=new int[N];
            for (int i = 0; i < N; i++) {
                sum=sum+array[i];
                help[i]=sum;
            }
            System.out.println(Arrays.toString(help));
            while (n>=0 &&m<=n){
                sumn+=help[n];
                n--;
                if (m-1>=0){
                    summ+=help[m-1];
                    m--;
                }
            }
            return sumn-summ;


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
            int sum=sort(array,0,1);
            System.out.println(sum);

        }
}
