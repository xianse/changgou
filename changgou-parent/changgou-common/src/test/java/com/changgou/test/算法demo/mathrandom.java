package com.changgou.test.算法demo;

public class mathrandom {
    public static void main(String[] args) {
        int[]arr=new int[9];
        int times=1000000;
        for (int i = 0; i < times; i++) {
            if (Math.random()<0.5){
                //0-9之间随机数
                int i1 = (int) (Math.random() * 3);
                int i2 = arr[i1];
                arr[i1]++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]+""+((double) arr[i])/ ((double) times));
        }
    }
}
