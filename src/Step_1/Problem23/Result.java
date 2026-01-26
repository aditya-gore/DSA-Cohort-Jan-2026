package Step_1.Problem23;

import java.util.List;

class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int maxHurdle = Integer.MIN_VALUE;
        for(int ht : height) {
            maxHurdle = Math.max(maxHurdle, ht);
        }
        return maxHurdle>k? maxHurdle-k : 0;
    }

}

