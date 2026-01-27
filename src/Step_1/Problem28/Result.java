package Step_1.Problem28;

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int days = 0;
        for(int start=i; start<=j; start++) {
            int reversed = reverse(start);
            if(isBeautiful(start,reversed, k)){
                days++;
            }
        }
        return days;
    }
    public static boolean isBeautiful(int num, int reverseNum, int k){
        int diff = Math.abs(num - reverseNum);
        return (diff % k == 0);
    }
    public static int reverse(int num) {
        int newNum=0;
        while(num>0){
            int rem = num % 10;
            newNum = newNum*10 + rem;
            num = num/10;
        }
        return newNum;
    }

}
