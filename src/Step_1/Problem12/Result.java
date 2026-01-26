package Step_1.Problem12;

import java.util.List;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxScore = scores.get(0);
        int minScore = scores.get(0);
        int maxBreaks = 0;
        int minBreaks = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > maxScore) {
                maxScore = score;
                maxBreaks++;
            } else if (score < minScore) {
                minScore = score;
                minBreaks++;
            }
        }
        return List.of(maxBreaks, minBreaks);

    }

}
