package Step_1.Problem2;

import java.util.List;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long ans = 0;
        for(int i=0; i< ar.size();i++){
            ans += ar.get(i);
        }
        return ans;
    }

}
