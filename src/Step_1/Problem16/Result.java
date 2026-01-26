package Step_1.Problem16;

import java.util.List;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        long combinedBill = 0;
        int annaRefused = bill.get(k);
        for(int n : bill){
            combinedBill += n;
        }
        combinedBill -= annaRefused;
        int annaOwed = (int) combinedBill / 2;
        if(annaOwed == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-annaOwed);
        }
    }

}
