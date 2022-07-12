package com.recursion.type;

public class headTailRecursion {

    public static void main(String[] args) {
        int x = 3;
        System.out.println("Head Recursion");
        headRecursion(x);
        System.out.println("Tail Recursion");
        tailRecursion(x);
    }

    private static void tailRecursion(int n) {
        if (n > 0) {
            System.out.println(+n);
            tailRecursion(n - 1);
        }
    }

      private static void headRecursion(int n) {
        if(n>0){
             headRecursion(n-1);
             System.out.println(+n);
        }
      }


}
