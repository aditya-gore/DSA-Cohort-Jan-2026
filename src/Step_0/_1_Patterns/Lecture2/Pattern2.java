package Step_0._1_Patterns.Lecture2;

import java.util.Scanner;

/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) ((char) i+65);
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
