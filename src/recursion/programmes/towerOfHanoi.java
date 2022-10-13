package recursion.programmes;

import java.util.Scanner;

public class towerOfHanoi {

    public static void  main(String[]args){
        int n;

        Scanner scn = new Scanner(System.in);
        n=scn.nextInt();
        toh(n,1,2,3);

    }

    private static void toh(int n, int A, int B, int C) {
        if(n>0){
            toh(n-1,A,C,B);
            System.out.println(+A+"," +C);
            toh(n-1,B,A,C);
        }

    }

}
