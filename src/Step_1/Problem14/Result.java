package Step_1.Problem14;

import java.util.List;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        // int left=0, right=0;
        int ans = 0;
        for(int left=0;left<n;left++) {
            int leftNum = ar.get(left);
            for(int right=0;right<n;right++) {
                int rightNum = ar.get(right);
                if(left < right && (leftNum + rightNum)%k==0){
                    ans++;
                }
            }
        }
        return ans;
    }

}
