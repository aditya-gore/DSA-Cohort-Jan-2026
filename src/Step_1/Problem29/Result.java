package Step_1.Problem29;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int people = 5;
        int totalLikes = 0;
        for(int i=1;i<=n;i++) {
            int share = people/2;
            totalLikes += share;
            people = share*3;
        }
        return totalLikes;
    }

}
