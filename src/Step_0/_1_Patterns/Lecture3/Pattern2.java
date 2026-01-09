package Step_0._1_Patterns.Lecture3;

import java.util.Scanner;

/*
* Q2.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
G H
F G H
E F G H
D E F G H
C D E F G H
B C D E F G H
A B C D E F G H
find for n=10
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int i = n; i >=0 ; i--) {
            for (int j = i; j <= n ; j++) {
                char ch = (char) (j + 65);
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
