package com.changgou.test.算法demo;

import javax.crypto.interfaces.PBEKey;

public class 小和问题 {

    //每一个数左边数比当前数小，左边数累加和就是小和
    //小和问题{1，3,4,2,5}小和是16
    public static int process(int[]array,int l,int r){
        if (l==r){
            return 0 ;
        }
        int mid=l+((r-l)/2);
        return process(array,l,mid)+process(array,mid+1,r)+merge(array,l,mid,r);
    }

    public static int merge(int[]arr,int l,int mid,int r){
        int i=0;
        int p1=l;
        int p2=mid+1;
        int[]help=new int[r-l+1];
        int ns=0;
        while (p1<=mid&&p2<=r){
            ns += arr[p1] <arr[p2] ? (r - p2 + 1)*arr[p1] : 0;
            help[i++]=arr[p1]<arr[p2]?arr[p1++] :arr[p2++];
            while (p1<=mid){
                help[i++]=arr[p1++];
            }
            while (p2<=r){
                help[i++]=arr[p2++];
            }
            for (i = 0; i < help.length; i++) {
                arr[l+i]=help[i];
            }
        }
        return ns;
    }

    public static void main(String[] args) {
        int[]arr={1,3,4,2,5};
        int process = process(arr, 0, 4);
        System.out.println(process);

    }
    //爬楼梯
}
