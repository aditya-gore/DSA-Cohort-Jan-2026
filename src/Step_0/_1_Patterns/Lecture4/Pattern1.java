package Step_0._1_Patterns.Lecture4;

import java.util.Scanner;

/*
Print the following pattern for the given N number of rows.
The dots represent spaces.
Constraints
0 <= N <= 50
Sample Input:
4
Sample Output:
...1
..12
.123
1234
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : "  );
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if(j<i){
                    System.out.print(".");
                } else {
                    System.out.print(j-i+1);
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
