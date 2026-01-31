package Step_1.Problem35;

import java.util.*;

class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }

}
