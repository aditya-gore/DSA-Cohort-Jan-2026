package Step_1.Problem43;

import java.util.List;

class Result {

    /*
     * Complete the 'runningTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int ans = 0;
        for(int i=1;i<n;i++){
            int j = i-1;
            int key = arr.get(i);
            while(j>=0 && arr.get(j)>key){
                arr.set(j+1, arr.get(j));
                j--;
                ans++;
            }
            arr.set(j+1, key);
        }
        return ans;
    }

}
