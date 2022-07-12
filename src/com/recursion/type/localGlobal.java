package com.recursion.type;

public class localGlobal {

    public static void main(String[] args) {
        int value, localValue;
        int x = 3;
        value = globalVariable(x);
        System.out.println("When variable is global "+value);
        localValue = localVariable(x);
        System.out.println("When variable is local "+localValue);

    }

       static int localVariable(int x) {
        int  y = 5;
       int k;
        if(x>0){
          //  System.out.println(+k);
          k=  localVariable(x-1)+y;
            System.out.println(+k);
            return k;
        }
        return 0;
    }

    private static int globalVariable(int x) {

        if(x>0){
           return globalVariable(x-1)+x;
      }
        return 0;
    }

}
