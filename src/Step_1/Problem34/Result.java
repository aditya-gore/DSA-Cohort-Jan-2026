package Step_1.Problem34;

import java.util.*;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        int min = Collections.min(brr);
        int max = Collections.max(brr);

        int[] freq = new int[max - min + 1];

        for (int num : brr) {
            freq[num - min]++;
        }

        for (int num : arr) {
            freq[num - min]--;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                ans.add(i + min);
            }
        }

        return ans; // already sorted
    }

}
