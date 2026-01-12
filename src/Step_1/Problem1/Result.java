package Step_1.Problem1;
import java.util.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ans = new ArrayList<>();
        int i=0, j = 0;
        int alice=0, bob = 0;
        while(i<a.size() && j<b.size()) {
            int categoryA = a.get(i);
            int categoryB = b.get(i);
            if(categoryA> categoryB) {
                alice++;
            } else if(categoryB > categoryA){
                bob++;
            }
            i++;
            j++;
        }
        ans.add(0, alice);
        ans.add(1, bob);
        return ans;
    }

}
