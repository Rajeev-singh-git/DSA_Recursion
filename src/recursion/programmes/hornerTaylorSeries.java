package recursion.programmes;

public class hornerTaylorSeries {

    static int x = 2, n = 10;
    static double s, res, result;


    public static void main(String[] args) {

        res = taylorRecursion(x, n);
        System.out.println(+res);
        result = taylorIterative(x, n);
        System.out.println(+result);


    }

    private static double taylorIterative(int x, int n) {
        double s = 1;
        int i;
        double num = 1;
        double den = 1;

        for (i = 1; i < n; i++) {
            num *= x;
            den *= i;
            s += num / den;
        }
        return s;
    }

    public static double taylorRecursion(int x, int n) {
        if (n == 0)
            return s;
        s = 1 + x * s / n;
        return taylorRecursion(x, n - 1);
    }


}
