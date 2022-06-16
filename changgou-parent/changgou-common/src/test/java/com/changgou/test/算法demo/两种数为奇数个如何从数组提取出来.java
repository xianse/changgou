package com.changgou.test.算法demo;

public class 两种数为奇数个如何从数组提取出来 {
    public static void main(String[] args) {
        int[]arr={3,3,4,6,7,3,9,2,1,4,6,7,1,2};//3,9
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor=eor^arr[i];
        }
        //eor=a^b   a !=b
        System.out.println(eor);
        //提取最后1的位置n&(~n+1)
        int right=eor&(~eor+1);
        int eor1=0;
        System.out.println(right);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]&right)==0){
                System.out.println(eor1^=arr[i]);
            }
            System.out.println(eor^eor1);
        }
        System.out.println(eor1+"==="+(eor^eor1));
    }
}
