package Step_1.Problem15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> birdMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int minKey = Integer.MAX_VALUE;
        for(int num : arr) {
            int curr = birdMap.getOrDefault(num,0)+1;
            birdMap.put(num, curr);
            max = Math.max(max, curr);
        }
        for(Map.Entry<Integer, Integer> entry : birdMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == max){
                minKey = Math.min(key, minKey);
            }
        }
        return minKey;
    }

}

