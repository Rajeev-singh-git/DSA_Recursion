package recursion.programmes;

import java.util.Scanner;

public class combinationFormula {

    public static void main(String[]args){
      int n,r,result,result2;

        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        r = scn.nextInt();

        result= ncr(n,r);
        System.out.println("Combination formula result  is "+result);
        result2= NCR(n,r);
        System.out.println("Combination formula result  using Recursion "+result2);

    }

    private static int NCR(int n, int r) {
        if(r==0||n==r)
            return 1;
        return NCR(n-1,r-1)+NCR(n-1,r);
    }

    private static int ncr(int n, int r) {
        int  num,den;

        num=fact(n);
        den=fact(r)*fact(n-r);
        return num/den;
    }

  private static int fact(int n) {
       if(n==0) return  1;
        return fact(n-1)*n;
   }



}
