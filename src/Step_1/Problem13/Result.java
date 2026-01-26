package Step_1.Problem13;

import java.util.List;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int left=0, right=0;
        int ans=0;
        int currSum=0;
        for(right=0;right<s.size();right++){
            currSum += s.get(right);
            if(right - left + 1 == m) {
                if(currSum == d) {
                    ans++;
                }
                currSum -= s.get(left);
                left++;
            }
        }
        return ans;
    }

}
