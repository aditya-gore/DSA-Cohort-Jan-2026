package Step_1.Problem30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();

        int n = arr.size();
        result.add(n);

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                result.add(n - i);
            }
        }

        return result;
    }
}
