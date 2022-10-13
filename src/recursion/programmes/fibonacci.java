package recursion.programmes;

import java.util.Scanner;

public class fibonacci {
    static int [] F= new int[10];

    public  static  void  main(String []args) {
        int fm,fr,fi;
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

        for (int i = 0; i < 10; i++) {
            F[i] = -1;
        }
         fm = fibonacciUsingMemoization(n);
         System.out.println("Fibonacci using Memoization " +fm);
         fr= fibRecursion(n);
         System.out.println("Fibonacci using recursion " +fr);
         fi= fibIterative(n);
         System.out.println("Fibonacci using Iteration " +fi);

    }

    private static int fibIterative(int n) {
        int r0 =0;
        int r1 =1, sum=0;
        for(int i =2; i<=n; i++){
            sum=r0+r1;
            r0=r1;
            r1=sum;
        }
        return  sum;
     }

    private static int fibRecursion(int n) {
        if(n<=1){
            return n;
        }else
            return fibRecursion(n-2)+fibRecursion(n-1);
    }

    public static int fibonacciUsingMemoization(int n) {
        if (n<=1){
            F[n]=n;
            return n;
       }else {
            if(F[n-2]==-1)
                F[n-2] = fibonacciUsingMemoization(n - 2);
            if(F[n-1]==-1)
                F[n-1] = fibonacciUsingMemoization(n - 1);
            return  F[n-2]+ F[n-1];
        }


    }


}
