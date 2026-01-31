package Step_1.Problem32;

class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        // Write your code here
        int ans = 0;
        int curr = n;
        while(curr > 0) {
            int temp = curr % 10;
            if(temp != 0 && n % temp == 0) ans++;
            curr /= 10;
        }
        return ans;
    }
}
