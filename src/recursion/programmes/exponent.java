package recursion.programmes;

import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        int s, k;
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        s = power(m, n);
        System.out.println("Using recursion " + s);
        k = pow(m, n);
        System.out.println("Using recursion but internally less no multiplication compared to previous method " + k);
    }

    private static int pow(int m, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return pow(m * m, n / 2);
        else
            return m * pow(m * m, (n - 1) / 2);

    }

    private static int power(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return power(m, n - 1) * m;
        }
    }
}
