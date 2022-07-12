package recursion.programmes;

import java.util.Scanner;

public class naturalNoSum {
    public static void main(String[] args) {
        int s, k, m;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        s = recursionSum(n);
        System.out.println("Using recursion " + s);
        k = formulaSum(n);
        System.out.println("Using Formula " + k);
        m = loopSum(n);
        System.out.println("Using loop " + m);
    }

    private static int loopSum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    private static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    private static int recursionSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return recursionSum(n - 1) + n;
        }

    }
}
