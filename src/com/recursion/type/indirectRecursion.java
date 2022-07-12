package com.recursion.type;

public class indirectRecursion {
    public  static  void main(String[]args){
        int n=20;
        m1(n);
    }

    private static void m1(int n) {
        if(n>0){
            System.out.println(+n);
            m2(n-1);
        }
    }

    private static void m2(int i) {
        if(i>1){
            System.out.println(+i);
            m1(i/2);
        }
    }
}
