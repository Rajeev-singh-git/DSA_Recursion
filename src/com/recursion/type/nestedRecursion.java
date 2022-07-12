package com.recursion.type;

public class nestedRecursion {
    public static void main(String[]args){
        int k,n=95;
        k=nested(n);
        System.out.println(+k);
    }

    private static int nested(int n) {
        if(n>100)
            return n-10;
        else
            return nested(nested(n+11));
    }
}
