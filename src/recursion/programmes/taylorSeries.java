package recursion.programmes;

public class taylorSeries {
    static float p = 1, f = 1;


    public static void main(String[] args) {

        System.out.println(taylor(4, 15));


    }

    private static float taylor(int x, int n) {
        float r;
        if (n == 0)
            return 1;
        else {
            r = taylor(x, n - 1);
            p = p * x;
            f = f * n;

            return r + p / f;
        }

    }

}
