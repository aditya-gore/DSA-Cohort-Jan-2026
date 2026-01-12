package Step_1.Problem4;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positive=0, negative=0, zero = 0;
        for (int num : arr) {
            if (num < 0) negative++;
            else if (num > 0) positive++;
            else zero++;
        }
        System.out.printf("%.6f%n",positive/arr.size());
        System.out.printf("%.6f%n",negative/arr.size());
        System.out.printf("%.6f%n",zero/arr.size());
    }

}
