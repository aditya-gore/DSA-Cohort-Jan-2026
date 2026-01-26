package Step_1.Problem22;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int alltitude=0;
        int valleys =0;
        for(char ch : path.toCharArray()) {
            if(ch=='U') {
                alltitude++;
                if(alltitude==0){
                    valleys++;
                }
            } else {
                alltitude--;
            }
        }
        return valleys;
    }
}
