package Step_1.Problem5;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for(int row=0;row<n;row++){
            for(int col=n-1;col>=0;col--) {
                if(col>row){
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

}
