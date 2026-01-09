package Step_0._1_Patterns.Lecture5;

import java.util.Scanner;

/*
Q2.Print the following pattern for the given number of rows.
Note: N is always odd.
The dots represent spaces.
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
..*
.***
*****
.***
..*
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        if(n%2==0) System.out.println("Invalid Input!");
        else {
            int mid = n / 2;
            // top half
            for (int row = 0; row < mid; row++) {
                int spaces = mid - row;
                int stars = 2 * row + 1;

                for (int s = 0; s < spaces; s++) {
                    System.out.print(".");
                }
                for (int st = 0; st < stars; st++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // middle row
            for (int star = 0; star < n; star++) {
                System.out.print("*");
            }
            System.out.println();

            // bottom half
            for (int row = mid + 1; row < n; row++) {
                int bottomRow = row-mid-1;
                int spaces = bottomRow + 1;
                int stars = n-2 * (bottomRow + 1);
                for (int s = 0; s < spaces; s++) {
                    System.out.print(".");
                }
                for (int st = 0; st < stars; st++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
