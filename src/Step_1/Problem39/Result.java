package Step_1.Problem39;

import java.util.*;

class Result {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int count = 0;
        int sum = 0;

        for (int price : prices) {
            if (sum + price > k) break;
            sum += price;
            count++;
        }
        return count;
    }

}
