package Step_1.Problem9;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for (int grade : grades) {
            if(grade < 38){
                ans.add(grade);
            } else{
                int closestMul = grade + (5 - (grade%5));
                if(closestMul-grade<3){
                    ans.add(closestMul);
                } else {
                    ans.add(grade);
                }
            }
        }
        return ans;
    }

}
