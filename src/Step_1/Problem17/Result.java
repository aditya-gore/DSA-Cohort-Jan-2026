package Step_1.Problem17;

import java.util.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int ans =0;
        Map<Integer,Integer> socks = new HashMap<>();
        for(int num : ar) {
            socks.put(num, socks.getOrDefault(num, 0)+1);
        }
        for(int value : socks.values()){
            ans += value / 2 ;
        }
        return ans;
    }

}
