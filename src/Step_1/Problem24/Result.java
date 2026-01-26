package Step_1.Problem24;

import java.util.List;

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int maxLetter = Integer.MIN_VALUE;
        for(char ch : word.toCharArray()) {
            maxLetter = Math.max(maxLetter, h.get(ch-97));
        }
        return maxLetter * word.length();
    }

}
