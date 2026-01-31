package Step_1.Problem42;

import java.util.List;

class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for(int i=1;i<n;i++){
            int key = arr.get(i);
            int j=i-1;
            while(j>=0 && arr.get(j)>key){
                arr.set(j+1, arr.get(j)); // shift right
                j--;
            }
            arr.set(j+1, key); // insert
            print(arr);
        }
    }
    private static void print(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
