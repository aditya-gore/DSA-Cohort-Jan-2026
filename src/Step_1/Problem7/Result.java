package Step_1.Problem7;

import java.util.List;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int ans = 0, max = Integer.MIN_VALUE;
        for(int candle : candles) {
            max = Math.max(max, candle);
        }
        for(int candle : candles) {
            if(candle == max) ans++;
        }
        return ans;
    }

}
