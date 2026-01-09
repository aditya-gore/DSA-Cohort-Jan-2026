package Step_0._1_Patterns.Lecture10;

import java.util.Scanner;

/*
Odd Square
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

Constraints :
0 <= N <= 50

Sample Input :
5
Sample Output:
13579
35791
57913
79135
91357
* */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int index = (row + col) % n;
                int value = 2 * index + 1;
                System.out.print(value);
            }
            System.out.println();
        }
        sc.close();
    }
}
