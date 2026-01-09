package Step_0._1_Patterns.Lecture7;

import java.util.Scanner;

/*
Parallelogram Pattern
Write a program to print parallelogram pattern for the given N number of rows.
The dots represent spaces.
Constraints :
0 <= N <= 50
Sample Input :
5
Sample Output :
*****
 *****
  *****
   *****
    *****
* */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n+row; col++) {
                if(col < row) System.out.print(".");
                else System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
