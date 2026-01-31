package Step_1.Problem36;

import java.util.*;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        int minDiff = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = arr.get(i + 1) - arr.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                ans.clear();
                ans.add(arr.get(i));
                ans.add(arr.get(i + 1));
            } else if (diff == minDiff) {
                ans.add(arr.get(i));
                ans.add(arr.get(i + 1));
            }
        }
        return ans;
    }

}
