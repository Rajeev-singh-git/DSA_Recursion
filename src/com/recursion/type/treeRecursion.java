package com.recursion.type;

public class treeRecursion {

    public static void main(String[]args){
        int x=3;
        treeRec(x);
    }

    private static void treeRec(int x) {
        if(x>0){
            System.out.println(+x);
            treeRec(x-1);
            treeRec(x-1);
        }
    }

}
