package Step_1.Problem33;

import java.util.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int n = a.size();
        k = k % n;
        List<Integer> ans = new ArrayList<>();
        for(int query : queries) {
            int index = (query-k+n)%n;
            ans.add(a.get(index));
        }
        return ans;
    }

}
