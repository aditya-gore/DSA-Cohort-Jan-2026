package Step_1.Problem6;

import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long total = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : arr) {
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println((total-max)+" "+ (total-min));
    }

}
