package Step_1.Problem37;

import java.util.List;

class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int num : arr) {
            if (leftSum == totalSum - leftSum - num) {
                return "YES";
            }
            leftSum += num;
        }
        return "NO";
    }

}
