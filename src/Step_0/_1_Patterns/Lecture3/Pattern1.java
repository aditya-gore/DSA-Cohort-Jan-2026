package Step_0._1_Patterns.Lecture3;

import java.util.Scanner;

/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G
Constraints
0 <= N <= 13
find for n=9
* */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) (i+j+65);
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
