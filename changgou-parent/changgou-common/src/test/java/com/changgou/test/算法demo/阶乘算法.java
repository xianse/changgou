package com.changgou.test.算法demo;

public class 阶乘算法 {

    //1!+2!+3!+......+n!

    /**
     * 1  2*1!   3*2! 4*3!
     * @param args
     */
    public static void main(String[] args) {
        int result=aVoid(4);
        System.out.println(result);
    }
    public static  int  aVoid(int n){
        int m=0;
        int z=1;
        for (int i = 1; i <=n; i++) {
               z= z*i;
               m+=z;
        }
        return m;
    }
}
