package Step_1.Problem31;

import java.util.*;

class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        Map<Integer, Integer> seqMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<p.size(); i++) {
            seqMap.put(p.get(i), i+1);
        }
        for(int i=1;i<=p.size();i++){
            int curr = seqMap.get(seqMap.get(i));
            ans.add(curr);
        }
        return ans;
    }

}
