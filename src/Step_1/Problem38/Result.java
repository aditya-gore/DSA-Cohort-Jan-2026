package Step_1.Problem38;

import java.util.*;

class Result {

    /*
     * Complete the 'jimOrders' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY orders as parameter.
     */

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        // Write your code here
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<orders.size();i++) {
            int orderTime = orders.get(i).get(0);
            int prepTime = orders.get(i).get(1);
            int deliveryTime = orderTime + prepTime;
            list.add(new int[]{deliveryTime,i+1});
        }
        list.sort((a,b)->a[0]-b[0]);

        List<Integer> ans = new ArrayList<>();
        for(int[] pair : list){
            ans.add(pair[1]);
        }
        return ans;
    }

}
