package recursion.programmes;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int s, m;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        s = fact(n);
        System.out.println("Using recursion " + s);
        m = loopFact(n);
        System.out.println("Using loop " + m);
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    private static int loopFact(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        return k;
    }

}
