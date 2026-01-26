package Step_1.Problem19;

import java.util.List;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        // Step 1: LCM of array a
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        // Step 2: GCD of array b
        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        // Step 3: Count multiples of lcmA that divide gcdB
        int count = 0;
        for (int x = lcmA; x <= gcdB; x += lcmA) {
            if (gcdB % x == 0) {
                count++;
            }
        }

        return count;
    }
    // Helper method to calculate GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to calculate LCM
    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

}
