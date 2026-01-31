package Step_1.Problem44;

class Result {

    /*
     * Complete the 'howManyGames' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        while(s>=m && p<=s){
            count++;
            s-=p;
            p = Math.max(p - d, m);
        }
        return count;
    }

}
