package Step_1.Problem25;

public class Result {
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int ans = Integer.MIN_VALUE;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int curr = keyboard + drive;
                if (curr <= b) {
                    ans = Math.max(ans, curr);
                }
            }
        }
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}
