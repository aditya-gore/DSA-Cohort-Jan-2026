package Step_1.Problem41;

import java.util.List;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int key = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && arr.get(i) > key) {
            arr.set(i + 1, arr.get(i));
            print(arr);
            i--;
        }
        arr.set(i + 1, key);
        print(arr);
    }
    private static void print(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
