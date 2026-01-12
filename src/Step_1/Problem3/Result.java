package Step_1.Problem3;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<arr.size();i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.size()-1-i);
        }
        return Math.abs(leftSum-rightSum);
    }

}