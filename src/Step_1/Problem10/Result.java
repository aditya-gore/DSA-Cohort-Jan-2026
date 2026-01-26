package Step_1.Problem10;

import java.util.List;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleC=0, orangeC=0;
        for(int apple : apples) {
            int dis = a + apple;
            if(dis >= s && dis <= t){
                appleC++;
            }
        }
        for(int orange : oranges){
            int dis = b+orange;
            if(dis >= s && dis <= t){
                orangeC++;
            }
        }
        System.out.println(appleC);
        System.out.println(orangeC);
    }

}
